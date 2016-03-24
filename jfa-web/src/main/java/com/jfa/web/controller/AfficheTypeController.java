/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.controller;

import com.jfa.commons.common.ResultMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("affichetype")
public class AfficheTypeController {


    public Map<String, Object> findAll(@RequestBody AfficheType afficheType){


        return ResultMap.success();
    }
}
