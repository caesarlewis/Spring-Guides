package com.jasonless.spring.test.service;

import com.starrk.spring.test.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author LiuShiZeng
 */
@Service
public class UserService {

    public User getUser(){
        User user = new User("1","aa");
        return user;
    }

    public Integer getMoney(){
        return 100;
    }


}
