/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.commons.json.annotation;

import java.lang.annotation.*;

/**
 * Use to how to fast access object's attribute
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface JsonPathValue {

    /**
     * The path of a JSONObject
     *
     * @return
     */
    String path() default "";

}
