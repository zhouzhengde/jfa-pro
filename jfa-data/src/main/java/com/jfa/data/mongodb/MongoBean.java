/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.data.mongodb;

import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.net.UnknownHostException;

@Repository
@ConditionalOnClass({MongoAutoConfiguration.class})
public class MongoBean extends MongoTemplate {

    @Autowired
    public MongoBean(MongoAutoConfiguration mongoAutoConfiguration) throws UnknownHostException {
        this(mongoAutoConfiguration.mongo(), mongoAutoConfiguration.getDateBase());
    }

    public MongoBean(Mongo mongo, String databaseName) {
        super(mongo, databaseName);
    }

}
