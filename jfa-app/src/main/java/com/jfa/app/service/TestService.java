/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.app.service;


import com.jfa.commons.common.Log;
import com.jfa.commons.exception.ServiceException;
import com.jfa.data.mongodb.MongoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Service
public class TestService {

    @Value("TestService.class")
    private Log log;

    @Autowired
    private MongoBean mongoBean;

    public Map findPerson() throws ServiceException {

        log.debug("############################################Hello>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Map rs = mongoBean.findOne(new Query(where("username").is("Xenia")), Map.class, "person");
        return rs;
    }

}
