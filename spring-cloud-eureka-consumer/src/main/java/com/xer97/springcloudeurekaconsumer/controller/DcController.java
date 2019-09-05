package com.xer97.springcloudeurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xer97
 * @date 2019/9/5 9:19
 */
@RestController
public class DcController {

    private LoadBalancerClient loadBalancerClient;
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        // 客户端 load balance
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }


    @Autowired
    public void setLoadBalancerClient(LoadBalancerClient loadBalancerClient) {
        this.loadBalancerClient = loadBalancerClient;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
