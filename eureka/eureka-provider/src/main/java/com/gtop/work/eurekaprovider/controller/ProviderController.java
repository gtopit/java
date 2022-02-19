package com.gtop.work.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongzw@citycloud.com.cn
 * @Date 2022/2/18 12:45
 */
@RestController
@RequestMapping("/v1")
public class ProviderController {

    @Value("${eureka.instance.metadata-map.zone}")
    private String zone;

    @GetMapping("/get/zone")
    public String getZone() {
        return zone;
    }

}
