package ru.dayneko.config;

import com.mongodb.reactivestreams.client.MongoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@Configuration
@RequiredArgsConstructor
public class MongodbTemplateConfig {

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate(@Value("${spring.data.mongodb.database}") String database, MongoClient mongoClient) {
        return new ReactiveMongoTemplate(mongoClient, database);
    }
}
