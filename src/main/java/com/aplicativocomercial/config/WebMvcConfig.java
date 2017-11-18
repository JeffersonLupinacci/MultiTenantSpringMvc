package com.aplicativocomercial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.aplicativocomercial.interceptor.MultitenancyInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

     @Override
     public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(new MultitenancyInterceptor());
     }
}
