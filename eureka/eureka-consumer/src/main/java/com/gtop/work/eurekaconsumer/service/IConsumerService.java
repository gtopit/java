package com.gtop.work.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hongzw@citycloud.com.cn
 * @Date 2022/2/18 16:31
 */
@FeignClient(value = "provider-api")
public interface IConsumerService {

    @RequestMapping(value = "/v1/get/zone")
    String getZone();

}
