package com.codetest.jbj.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig  implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/*")
                .allowedOrigins(Constants.FrontEnd_URL)
                .allowedMethods("PUT", "GET","DELETE", "ERROR")
                //.allowedHeaders("header1", "header2", "header3")
                //.exposedHeaders("header1", "header2")
                .allowCredentials(false).maxAge(3600);


    }
}