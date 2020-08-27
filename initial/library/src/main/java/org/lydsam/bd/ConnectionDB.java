package org.lydsam.bd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class ConnectionDB {

    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory(){
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/lydsam");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        try{
            return new MongoTemplate(mongoDatabaseFactory());
        }catch(Exception e){
            System.out.println("offline with mongodb");
            System.out.println(e.getMessage());
            return null;
        }
    }
}
