/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.data.entity;

import java.io.Serializable;
import java.util.List;

public class Country implements Serializable {

    private Integer id;

    private String code;

    private String name;

    private List<Province> provinces;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }
}
