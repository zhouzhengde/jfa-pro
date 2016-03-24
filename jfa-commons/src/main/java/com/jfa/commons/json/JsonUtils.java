/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.commons.json;

import com.jayway.jsonpath.JsonPath;
import com.jfa.commons.json.annotation.JsonPathValue;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class JsonUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    private JsonUtils() {
    }

    /**
     * 将JSON对象转换成JavaBean
     *
     * @param jsonObject
     * @param clz
     * @param <T>
     * @return
     */
    public static <T extends Serializable> T toBean(JSONObject jsonObject, Class<T> clz) {

        T instance = null;
        try {
            instance = clz.newInstance();

            Field[] fields = clz.getDeclaredFields();

            if (fields == null || fields.length == 0) {
                return instance;
            }

            for (Field field : fields) {

                Annotation[] annotations = field.getDeclaredAnnotations();

                if (annotations == null || annotations.length == 0) {
                    continue;
                }

                for (Annotation annotation : annotations) {

                    if (annotation.annotationType().equals(JsonPathValue.class)) {

                        JsonPathValue value = (JsonPathValue) annotation;
                        injectValue(instance, jsonObject, field, value);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("[JsonUtils toBean]", e);
        }
        return instance;
    }

    /**
     * 注入值到对象中
     *
     * @param obj
     * @param jsonObject
     * @param field
     * @param value
     */
    private static void injectValue(Object obj, JSONObject jsonObject, Field field, JsonPathValue value) {

        String path = "$." + value.path();
        field.setAccessible(true);
        try {
            field.set(obj, getValue(jsonObject, path));
        } catch (IllegalAccessException e) {
            LOGGER.error("[JsonUtils Inject Value]", e);
        }
    }

    /**
     * 从JSON对象中获取值
     *
     * @param jsonObject
     * @param path
     * @return
     */
    private static Object getValue(JSONObject jsonObject, String path) {

        try {
            return JsonPath.read(jsonObject, path);
        } catch (Exception e) {
            LOGGER.warn("[JsonUtils getValue]", e);
            return null;
        }
    }
}
