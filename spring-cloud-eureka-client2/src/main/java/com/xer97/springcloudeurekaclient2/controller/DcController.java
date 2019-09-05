package com.xer97.springcloudeurekaclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xer97
 * @date 2019/9/4 23:42
 */
@RestController
public class DcController {

    private DiscoveryClient discoveryClient;

    @Autowired
    public void setDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/dc")
    public String dc() {
        String services = "Client2 - Services:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
