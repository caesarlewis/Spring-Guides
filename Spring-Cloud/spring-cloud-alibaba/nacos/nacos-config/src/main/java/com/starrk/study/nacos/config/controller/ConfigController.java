package com.starrk.study.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuShiZeng
 * @since 2020/6/18
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    Integer age;

    @RequestMapping("/user")
    public String simple() {
        return "Hello Nacos Config!" + "Hello " + userName + " " + age;
    }
}

