package org.store.online.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoreDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreDiscoveryServerApplication.class, args);
    }
}
