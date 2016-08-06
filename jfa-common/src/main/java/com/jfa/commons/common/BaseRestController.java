/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.commons.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

public abstract class BaseRestController extends BaseController {

    @ExceptionHandler(Exception.class)
    protected Map<String, Object> handleException(Exception ex) {
        return ResultMap.failure(ex);
    }
}
