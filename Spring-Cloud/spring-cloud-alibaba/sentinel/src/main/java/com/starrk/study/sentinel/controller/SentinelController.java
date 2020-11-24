package com.starrk.study.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuShiZeng
 * @since 2020/6/22
 */
@RestController
public class SentinelController {

    @GetMapping("/hello")
    @SentinelResource("hello")
    public String hello(){
        return "Hello Sentinel";
    }


}
