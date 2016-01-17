/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.data.entity;

import java.io.Serializable;
import java.util.List;

public class Province implements Serializable {

    private Integer id;

    private String code;

    private String name;

    private List<City> cities;

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

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
