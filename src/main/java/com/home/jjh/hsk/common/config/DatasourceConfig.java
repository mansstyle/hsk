package com.home.jjh.hsk.common.config;

import javax.sql.DataSource;

import com.home.jjh.hsk.common.infra.SLF4JQueryLoggingListener;

import org.apache.ibatis.session.AutoMappingBehavior;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import lombok.extern.slf4j.Slf4j;
import net.ttddyy.dsproxy.support.ProxyDataSourceBuilder;

@Slf4j
@Configuration
//@MapperScan(value="com.home.jjh.hsk.mapper", sqlSessionTemplateRef="sqlSessionTemplateBase")
@MapperScan(value="com.home.jjh.hsk.mapper")//, sqlSessionTemplateRef="sqlSessionTemplateBase"
public class DatasourceConfig {

	@Autowired
	Environment env;

	@Primary
	@SuppressWarnings({"rawtypes"})
	@Bean(name="dataSourceBase")
	public DataSource dataSource() {
		DataSourceBuilder dataSource = DataSourceBuilder.create();
		
		dataSource.driverClassName(env.getProperty("spring.datasource1.driver-class-name"));
		dataSource.url(env.getProperty("spring.datasource1.url"));
		dataSource.username(env.getProperty("spring.datasource1.username"));
		dataSource.password(env.getProperty("spring.datasource1.password"));
		
		return dataSource.build();
	}

	/**
	 * 쿼리로그를 남기기위한 프록시 설정
	 * @param actualDataSource
	 * @return
	 */
	@Bean(name="dataSourceProxyBase")
	public DataSource proxyDataSource(@Qualifier("dataSourceBase") DataSource actualDataSource) {
		return ProxyDataSourceBuilder
                .create(actualDataSource)
                .name("dataSourceBase")
                .listener(new SLF4JQueryLoggingListener())
                .build();
	}

	@Bean(name="sqlSessionFactoryBase")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSourceProxyBase") DataSource dataSource, ApplicationContext ctx) throws Exception {

		// log.info("mapper-location={}", env.getProperty("spring.datasource.mapper-location"));
		
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

		SqlSessionFactoryBean sqlSessionBean = new SqlSessionFactoryBean();
		sqlSessionBean.setDataSource(dataSource);
		sqlSessionBean.setMapperLocations(resolver.getResources(env.getProperty("spring.datasource.mapper-location")));

		// TypeHandler<?> handlers[] = {new InputStreamTypeHandler(), new ReaderTypeHandler()};
        // sqlSessionBean.setTypeHandlers(handlers);

		return sqlSessionBean.getObject();
	}


	@Bean(name="sqlSessionTemplateBase")
	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactoryBase") SqlSessionFactory sqlSessionFactory) {

		sqlSessionFactory.getConfiguration().setCacheEnabled(true); //cache 사용여부
		sqlSessionFactory.getConfiguration().setUseGeneratedKeys(true); //쿼리문 내 키생성 사용가능 여부
		sqlSessionFactory.getConfiguration().setLazyLoadingEnabled(true); //???
		sqlSessionFactory.getConfiguration().setUseColumnLabel(true); //xml내 칼럼 라벨사용가능 여부
		sqlSessionFactory.getConfiguration().setAutoMappingBehavior(AutoMappingBehavior.PARTIAL);
		sqlSessionFactory.getConfiguration().setMultipleResultSetsEnabled(true);
		sqlSessionFactory.getConfiguration().setSafeRowBoundsEnabled(true);
		sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true); //camelcase 사용
		sqlSessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL); 
		sqlSessionFactory.getConfiguration().setDefaultExecutorType(ExecutorType.BATCH);
		
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}