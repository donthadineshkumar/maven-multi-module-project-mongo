package org.lydsam.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketException;

@ComponentScan("org.lydsam")
@SpringBootApplication/*(scanBasePackages = { "org.lydsam.sales",
        "org.lydsam.bd" })*/
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class,
        MongoDataAutoConfiguration.class})
@RestController
public class SalesApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(SalesApplication.class, args);
        }  catch (Exception e) {
            System.out.println("MongoDb is offline");
        }
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}