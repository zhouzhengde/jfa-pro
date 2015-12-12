/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.app.controller;

import com.jfa.commons.common.ResultMap;
import com.jfa.commons.exception.ControllerException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("user")
public class UserController {

   @RequestMapping("{uid}")
    public Map sayhello(@PathVariable String uid) throws ControllerException{
        ResultMap.put("uid", uid);
        return ResultMap.success();
    }
}
