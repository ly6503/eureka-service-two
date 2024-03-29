package com.example.eurekaregistercenter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterCenter1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterCenter1Application.class, args);
    }

}
