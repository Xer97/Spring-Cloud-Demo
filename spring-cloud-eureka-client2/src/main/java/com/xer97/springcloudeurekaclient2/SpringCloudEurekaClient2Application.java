package com.xer97.springcloudeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient2Application.class, args);
    }

}
