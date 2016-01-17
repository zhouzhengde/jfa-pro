/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.data.mapper;

import com.jfa.data.ApplicationRunner;
import com.jfa.data.entity.Country;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationRunner.class)
public class CountryMapperTest extends TestCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryMapperTest.class);

    @Resource
    private CountryMapper countryMapper;

    @Test
    public void testFindAll() throws Exception {

        List<Country> list = countryMapper.findAll();

        assertNotNull(list);
    }
}