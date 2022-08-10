package com.pupu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PupuAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(PupuAdminApplication.class, args);
    }

}
