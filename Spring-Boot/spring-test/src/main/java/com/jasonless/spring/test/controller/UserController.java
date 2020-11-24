package com.jasonless.spring.test.controller;

import com.jasonless.Jasonless;
import com.starrk.spring.test.entity.User;
import com.starrk.spring.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuShiZeng
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    Jasonless createJasonless;

    @GetMapping("/get")
    public User getUser(){
        User user = userService.getUser();
        return user;
    }

    @GetMapping("/jasonless")
    public String getCreateJasonless(){
        return createJasonless.getName();
    }

}
