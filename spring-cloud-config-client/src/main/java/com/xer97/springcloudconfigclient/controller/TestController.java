package com.xer97.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xer97
 * @date 2019/9/6 23:38
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from() {
        return from;
    }
}
