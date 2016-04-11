/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.commons.common;

import com.jfa.commons.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bond
 */
public class ResultMap {

    private ResultMap() {
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ResultMap.class);

    /**
     * 缓存返回结果，控制线程安全
     */
    private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();

    /**
     * 加入其它需要返回的结果
     *
     * @param key    String
     * @param object Object
     */
    public static void put(String key, Object object) {
        if (threadLocal.get() == null) {
            threadLocal.set(new HashMap<String, Object>());
        }
        LOGGER.info("[Add a result to ResultMap][Key]:" + key + ",[Value]:" + object.toString());
        threadLocal.get().put(key, object);
    }

    /**
     * 返回失败处理结果
     *
     * @param message String
     * @param e       Exception
     * @return
     */
    public static Map<String, Object> failure(String message, Exception e) {
        put(Constants.REST_MESSAGE, message);
        return failure(e);
    }

    /**
     * 返回成功处理结果
     *
     * @param
     * @return
     */

    public static Map<String, Object> success() {
        put(Constants.REST_STATUS, Constants.REST_ACK_OK);
        put(Constants.REST_MESSAGE, Constants.REST_OK_MESSAGE);
        return returnResult();
    }

    /**
     * 返回失败处理结果
     *
     * @param
     * @return
     */
    public static Map<String, Object> failure(Exception e) {
        if (e != null) {
            LOGGER.error(e.getMessage(), e);
        }
        put(Constants.REST_STATUS, Constants.REST_ACK_ERROR);
        put(Constants.REST_MESSAGE, Constants.REST_ERROR_MESSAGE);
        put(Constants.REST_CAUSES, e.getMessage());
        return returnResult();
    }

    private static Map<String, Object> returnResult() {
        Map<String, Object> rs = threadLocal.get();
        threadLocal.set(null);
        return rs;
    }
}