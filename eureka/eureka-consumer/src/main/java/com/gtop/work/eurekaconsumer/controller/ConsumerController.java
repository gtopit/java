package com.gtop.work.eurekaconsumer.controller;

import com.gtop.work.eurekaconsumer.service.IConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hongzw@citycloud.com.cn
 * @Date 2022/2/18 14:42
 */
@RestController
@RequestMapping("/v1")
public class ConsumerController {

    @Resource
    private IConsumerService service;

    @GetMapping("/get/service")
    public String getService() {
        return service.getZone();
    }

}
