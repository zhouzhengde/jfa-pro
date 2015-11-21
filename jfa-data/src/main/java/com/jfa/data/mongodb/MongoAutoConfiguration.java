/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

package com.jfa.data.mongodb;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;
import java.net.UnknownHostException;

@Configuration
@ConditionalOnClass({Mongo.class, MongoClient.class})
@EnableConfigurationProperties(MongoProperties.class)
@ConditionalOnMissingBean(type = "org.springframework.data.mongodb.MongoDbFactory")
public class MongoAutoConfiguration {

    @Autowired
    private MongoProperties mongoProperties;

    @Autowired(required = false)
    private MongoClientOptions options;

    private Mongo mongo;

    @PreDestroy
    public void close() {
        if (this.mongo != null) {
            this.mongo.close();
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public Mongo mongo() throws UnknownHostException {
        this.mongo = this.mongoProperties.createMongoClient(this.options);
        return this.mongo;
    }

    public String getDateBase() {
        return this.mongoProperties.getDatabase();
    }


}
