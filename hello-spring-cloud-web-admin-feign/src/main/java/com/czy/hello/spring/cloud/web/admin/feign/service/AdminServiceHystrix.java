package com.czy.hello.spring.cloud.web.admin.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by czy0218 on 2019/1/2.
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
