package com.xer97.springcloudeurekaconsumerfeign.controller;

import com.xer97.springcloudeurekaconsumerfeign.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xer97
 * @date 2019/9/5 10:15
 */
@RestController
public class DcController {

    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

    @Autowired
    public void setDcClient(DcClient dcClient) {
        this.dcClient = dcClient;
    }
}
