package com.example.eurekaserviceuser2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceUser2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceUser2Application.class, args);
    }

}
