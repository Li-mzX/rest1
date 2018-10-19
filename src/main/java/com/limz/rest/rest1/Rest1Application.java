package com.limz.rest.rest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Rest1Application {

    public static void main(String[] args) {
        SpringApplication.run(Rest1Application.class, args);
    }
}
