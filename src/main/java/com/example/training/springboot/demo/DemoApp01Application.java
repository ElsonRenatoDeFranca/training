package com.example.training.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.training.springboot.entity")
@ComponentScan({ "com.example.training.springboot.controller", "com.example.training.springboot.service", "com.example.training.springboot.service.impl"})
@EnableJpaRepositories("com.example.training.springboot.dao")
public class DemoApp01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp01Application.class, args);
    }
}
