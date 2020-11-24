package com.starrk.study.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuShiZeng
 * @since 2020/6/17
 */
@SpringBootApplication
public class NacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class,args);
    }

    @RestController
    public class EchoController{

        @GetMapping(value = "/echo/{str}")
        public String echo(@PathVariable String str){
            return "Hello Nacos Discovery"+str;
        }
    }

}
