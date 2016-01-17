/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.controller;

import java.util.ArrayList;
import java.util.List;

public class DemoBean {

    private String id;

    private String name;

    private List<DemoBean> siblings = new ArrayList<DemoBean>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DemoBean> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<DemoBean> siblings) {
        this.siblings = siblings;
    }
}
