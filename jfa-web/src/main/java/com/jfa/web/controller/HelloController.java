/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.controller;


import com.jfa.commons.common.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public Map<String, Object> sayHello() {
        ResultMap.put("name", "bond");
        return ResultMap.success();
    }
}
