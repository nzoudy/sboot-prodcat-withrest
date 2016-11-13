package com.zoudys.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class AppConfig {
	
	private final String DB_HOST_CONNECTION = "localhost";
	private final int DB_PORT_CONNECTION = 27017;
	private final String DB_NAME_CONNECTION = "sboot-prodcat-withrest";
	
	
	@Bean
	public MongoDbFactory mongoDbConnectionFactory() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient(DB_HOST_CONNECTION, DB_PORT_CONNECTION );
		SimpleMongoDbFactory dbFactory = new SimpleMongoDbFactory(mongoClient, DB_NAME_CONNECTION);
		return dbFactory;
	}

	@Bean
	public MongoOperations mongoOperations() throws UnknownHostException {
		MongoDbFactory dbConnectionFactory = mongoDbConnectionFactory();
		MongoTemplate mongoTemplate = new MongoTemplate(dbConnectionFactory);
		return mongoTemplate;
	}
	
}