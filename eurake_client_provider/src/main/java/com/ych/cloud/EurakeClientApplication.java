package com.ych.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurakeClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurakeClientApplication.class, args);
    }
}
