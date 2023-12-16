package com.yubi.ASPRTC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages ="com.yubi.ASPRTC.*")
public class ASPRTCApplication {

    public static void main(String[] args) {
        SpringApplication.run(ASPRTCApplication.class, args);
    }

}
