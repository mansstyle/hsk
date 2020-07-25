package com.home.jjh.hsk.common.infra;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.extern.slf4j.Slf4j;
import net.ttddyy.dsproxy.ExecutionInfo;
import net.ttddyy.dsproxy.QueryInfo;
import net.ttddyy.dsproxy.listener.QueryExecutionListener;
import net.ttddyy.dsproxy.listener.logging.SLF4JLogLevel;
import net.ttddyy.dsproxy.proxy.ParameterSetOperation;

@Slf4j
public class SLF4JQueryLoggingListener implements QueryExecutionListener {

	SLF4JLogLevel logLevel = SLF4JLogLevel.INFO;

	boolean useReplaceParameter = true;

	boolean useReplaceWhitespace = false;

	boolean includeParameter = false;
	
	boolean useExcludeSqlLogging = true;

	String logTemplate = "Datasource:{} Time:{} Num:{} Query:{}";

	/**
	 * ? 를 찾는 pattern
	 */
	private static Pattern questionPattern = Pattern.compile("\\?{1}");

	@Override
	public void beforeQuery(ExecutionInfo executioninfo, List<QueryInfo> list) {
		
	}
	
	@Override
	public void afterQuery(ExecutionInfo execInfo, List<QueryInfo> queryInfoList) {
		String dataSourceName = execInfo.getDataSourceName();
		int count = 0;
		StringBuffer sb = new StringBuffer();
		
		for(QueryInfo queryInfo : queryInfoList){
			
			List<List<ParameterSetOperation>> args = queryInfo.getParametersList();
			String query = queryInfo.getQuery();
			String padding = null;
			
			if(isExcluedSqlLogging(query)) {
				sb.append(" exclude sql logging.");
			} else {
				if (useReplaceWhitespace) {
					query = query.replaceAll("\\s+", " ");
					padding = "\t\t";
				} else {
					padding = "\n";
				}
				sb.append("{");
				sb.append(padding);
				count++;
				if (useReplaceParameter) {
					Matcher matcher = questionPattern.matcher(query);
					for(List<ParameterSetOperation> params : args){
						int i = 0, length = params.size();
						while (matcher.find()) {
							String replaced = i < length ? toString(params.get(i), true) : "?";
							matcher.appendReplacement(sb, replaced);
							i++;
						}
					}
					
					matcher.appendTail(sb);
					sb.append(padding);
					sb.append("}");
				} 
				
				else {
					sb.append(query);
					sb.append(padding);
					sb.append("}");
				}
				/*
				if (includeParameter) {
					sb.append("\n");
					for(List<ParameterSetOperation> params : args){
						appendQueryArgs(sb, params);
					}
				}
				*/
			}
		}
		if (includeParameter) {
			for(QueryInfo queryInfo : queryInfoList){
				List<List<ParameterSetOperation>> args = queryInfo.getParametersList();
				sb.append("\n ");
				sb.append(++count);
				sb.append(" : ");
				for(List<ParameterSetOperation> params : args){
					appendQueryArgs(sb, params);
				}
			}
		}

		writeLog(new Object[] {				 
				dataSourceName, 
				execInfo.getElapsedTime(),
				queryInfoList.size(), 
				sb.toString() });
	}

	@SuppressWarnings("rawtypes")
	private void appendQueryArgs(StringBuffer sb, List args) {
		sb.append("[");
		for (Iterator i$ = args.iterator(); i$.hasNext();) {
			Object arg = i$.next();
			sb.append(toString(arg, false));
			if (i$.hasNext()) {
				sb.append(", ");
			}
		}
		sb.append("]");
	}

	private String toString(Object o, boolean withQuote) {
		if (o == null) {
			return "null";
		} else {
			if(o instanceof ParameterSetOperation){
				ParameterSetOperation operation = (ParameterSetOperation)o;
				withQuote = operation.getMethod().getName().equals("setString");
				String v = ((ParameterSetOperation) o).getArgs()[1].toString();
				return withQuote ? "'" + v.replace("$", "\\$") + "'" : v.replace("$", "\\$");
			}
			return withQuote ? "'" + o.toString().replace("$", "\\$") + "'" : o
					.toString().replace("$", "\\$");
		}
	}

	private void writeLog(Object argArray[]) {
		switch (logLevel) {
		case DEBUG:
			log.debug(logTemplate, argArray);
			break;
		case ERROR:
			log.error(logTemplate, argArray);
			break;
		case INFO:
			log.info(logTemplate, argArray);
			break;
		case TRACE:
			log.trace(logTemplate, argArray);
			break;
		case WARN:
			log.warn(logTemplate, argArray);
			break;
		default:
		}
	}

	
	/**
	 * SQL Logging 제외
	 * @param query
	 * @return
	 */
	private boolean isExcluedSqlLogging(String query) {
		if(useExcludeSqlLogging && query.contains("EXCLUDE_SQL_LOGGING")){
			return true;
		} else {
			return false;
		}		
	}

	public SLF4JLogLevel getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(SLF4JLogLevel logLevel) {
		this.logLevel = logLevel;
	}

	public boolean isUseReplaceParameter() {
		return useReplaceParameter;
	}

	public void setUseReplaceParameter(boolean useReplaceParameter) {
		this.useReplaceParameter = useReplaceParameter;
	}

	public boolean isUseReplaceWhitespace() {
		return useReplaceWhitespace;
	}

	public void setUseReplaceWhitespace(boolean useReplaceWhitespace) {
		this.useReplaceWhitespace = useReplaceWhitespace;
	}

	public boolean isIncludeParameter() {
		return includeParameter;
	}

	public void setIncludeParameter(boolean includeParameter) {
		this.includeParameter = includeParameter;
	}

	public boolean isUseExcludeSqlLogging() {
		return useExcludeSqlLogging;
	}

	public void setUseExcludeSqlLogging(boolean useExcludeSqlLogging) {
		this.useExcludeSqlLogging = useExcludeSqlLogging;
	}

	public String getLogTemplate() {
		return logTemplate;
	}

	public void setLogTemplate(String logTemplate) {
		this.logTemplate = logTemplate;
	}
}