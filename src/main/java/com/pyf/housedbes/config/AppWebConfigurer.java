package com.pyf.housedbes.config;

import com.pyf.housedbes.filter.ControllerFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ADMIN
 */
@Configuration
public class AppWebConfigurer implements WebMvcConfigurer {


    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ControllerFilter()).addPathPatterns("/**");

    }
}
