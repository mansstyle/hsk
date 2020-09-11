package com.home.jjh.hsk.config;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;


public class MvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/templates/" , "classpath:/static/" , "classpath:/web/")
//                .setCachePeriod(20) ;
                .setCacheControl(CacheControl.maxAge(10 , TimeUnit.MINUTES));
    }

}
