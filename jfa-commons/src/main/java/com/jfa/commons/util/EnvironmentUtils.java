/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.commons.util;

public class EnvironmentUtils {

    private EnvironmentUtils() {
    }

    /**
     * Get current project root context path.
     *
     * @return
     */
    public static String getRootPath() {
        return Thread.currentThread().getContextClassLoader().getResource("").getPath();
    }

}
