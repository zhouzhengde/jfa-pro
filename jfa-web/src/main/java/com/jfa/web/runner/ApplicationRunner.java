
/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.runner;

import com.jfa.commons.common.ResultMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@ComponentScan(basePackages = "com.jfa")
public class ApplicationRunner extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}