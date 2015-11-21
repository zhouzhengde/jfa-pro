/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.app.service;

import com.jfa.commons.common.Log;
import com.jfa.data.mongodb.MongoAutoConfiguration;
import com.jfa.data.mongodb.MongoBean;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestService.class, MongoAutoConfiguration.class, MongoBean.class, Log.class}, initializers = ConfigFileApplicationContextInitializer.class)
@ComponentScan
public class TestServiceTest extends TestCase {

    @Autowired
    private TestService service;

    @Test
    public void findPerson() throws  Exception{

        Map rs =service.findPerson();
        assertNotNull(rs);

    }
}