package com.example.springbootampqlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootGraylogApplication {
    private  static final Logger logger = LoggerFactory.getLogger(SpringBootGraylogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGraylogApplication.class, args);
    }

    @PostConstruct
    void init(){


        for(int i=0;i<100;i++) {
            logger.info("test log : "+i++);
        }

    }

}
