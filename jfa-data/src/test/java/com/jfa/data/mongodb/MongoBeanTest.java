/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.data.mongodb;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoBean.class, MongoAutoConfiguration.class}, initializers = ConfigFileApplicationContextInitializer.class)
public class MongoBeanTest extends TestCase {


    @Autowired
    private MongoBean mongoBean;

    @Value("${data.mongodb.host}")
    private String host;

    @Test
    public void testConnection() throws Exception {

        Map rs = mongoBean.findOne(new Query(where("username").is("Xenia")), Map.class, "person");

        assertNotNull(host);

    }

}

