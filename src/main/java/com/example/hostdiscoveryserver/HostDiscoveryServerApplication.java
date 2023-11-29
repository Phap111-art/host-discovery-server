package com.example.hostdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HostDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HostDiscoveryServerApplication.class, args);
    }
}
