package com.example.eurekaregistercenter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterCenter2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterCenter2Application.class, args);
    }

}
