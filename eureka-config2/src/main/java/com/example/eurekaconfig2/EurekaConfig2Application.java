package com.example.eurekaconfig2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EurekaConfig2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfig2Application.class, args);
    }

}
