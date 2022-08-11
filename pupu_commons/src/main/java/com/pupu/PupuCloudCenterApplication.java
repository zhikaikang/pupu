package com.pupu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PupuCloudCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PupuCloudCenterApplication.class, args);
        System.out.println("http://localhost:9990");
    }

}
