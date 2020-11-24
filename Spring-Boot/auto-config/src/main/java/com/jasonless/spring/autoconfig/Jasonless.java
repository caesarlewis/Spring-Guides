package com.jasonless.spring.autoconfig;

/**
 * @author LiuShiZeng
 * @since 2020/8/25
 */
public class Jasonless {

    private String name;


    public Jasonless(){

    }

    public Jasonless(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
