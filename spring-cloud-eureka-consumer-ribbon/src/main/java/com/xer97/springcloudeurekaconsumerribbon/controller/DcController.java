package com.xer97.springcloudeurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xer97
 * @date 2019/9/5 9:58
 */
@RestController
public class DcController {

    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        System.out.println("ribbon load balance");
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
