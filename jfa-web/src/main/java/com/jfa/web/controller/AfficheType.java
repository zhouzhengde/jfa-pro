/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.controller;

import java.io.Serializable;

public class AfficheType implements Serializable {

    private String annCategory1Code;
    private String annCategory2Code;
    private String annCategory3Code;
    private String annCategory1Name;
    private String annCategory2Name;
    private String annCategory3Name;
    private String type;
    private String content;

    public String getAnnCategory1Code() {
        return annCategory1Code;
    }

    public void setAnnCategory1Code(String annCategory1Code) {
        this.annCategory1Code = annCategory1Code;
    }

    public String getAnnCategory2Code() {
        return annCategory2Code;
    }

    public void setAnnCategory2Code(String annCategory2Code) {
        this.annCategory2Code = annCategory2Code;
    }

    public String getAnnCategory3Code() {
        return annCategory3Code;
    }

    public void setAnnCategory3Code(String annCategory3Code) {
        this.annCategory3Code = annCategory3Code;
    }

    public String getAnnCategory1Name() {
        return annCategory1Name;
    }

    public void setAnnCategory1Name(String annCategory1Name) {
        this.annCategory1Name = annCategory1Name;
    }

    public String getAnnCategory2Name() {
        return annCategory2Name;
    }

    public void setAnnCategory2Name(String annCategory2Name) {
        this.annCategory2Name = annCategory2Name;
    }

    public String getAnnCategory3Name() {
        return annCategory3Name;
    }

    public void setAnnCategory3Name(String annCategory3Name) {
        this.annCategory3Name = annCategory3Name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AfficheType() {
    }

    public AfficheType(String annCategory1Code, String annCategory2Code, String annCategory3Code, String annCategory1Name, String annCategory2Name, String annCategory3Name, String type, String content) {
        this.annCategory1Code = annCategory1Code;
        this.annCategory2Code = annCategory2Code;
        this.annCategory3Code = annCategory3Code;
        this.annCategory1Name = annCategory1Name;
        this.annCategory2Name = annCategory2Name;
        this.annCategory3Name = annCategory3Name;
        this.type = type;
        this.content = content;
    }
}
