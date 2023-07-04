package com.chat2thesis.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rabbit
 */
@SpringBootApplication
@MapperScan("com.chat2thesis.service.dao.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.  run(Application.class, args);
    }

}
