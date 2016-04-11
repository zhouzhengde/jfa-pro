/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.commons.json.example;

import com.jfa.commons.json.annotation.JsonPathValue;

import java.io.Serializable;

public class Person implements Serializable {

    @JsonPathValue(path = "Id")
    private int id;

    @JsonPathValue(path = "Name")
    private String name;

    @JsonPathValue(path = "Contact.MobilePhone")
    private String mobilePhone;

    @JsonPathValue(path = "Contact.Email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
