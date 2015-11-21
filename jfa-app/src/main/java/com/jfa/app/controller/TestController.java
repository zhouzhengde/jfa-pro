/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.app.controller;


import com.jfa.commons.common.BaseRestController;
import com.jfa.commons.common.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController extends BaseRestController {

    @RequestMapping("say")
    public Map<String, Object> say() {
        return ResultMap.success();
    }
}
