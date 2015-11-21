
/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class ApplicationRunner extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}