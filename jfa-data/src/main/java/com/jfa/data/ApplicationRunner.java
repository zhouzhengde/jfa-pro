
/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jfa")
public class ApplicationRunner extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}