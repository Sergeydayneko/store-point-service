package ru.dayneko.storepointservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StorePointServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorePointServiceApplication.class, args);
    }

}
