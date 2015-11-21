/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.commons.exception;

public class ServiceException extends Exception {

    public ServiceException(String msg, Exception e) {
        super(msg, e);
    }
}
