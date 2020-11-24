package com.jasonless.spring.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author LiuShiZeng
 * @since 2020/8/25
 */
@ConfigurationProperties(prefix = "com.jasonless")
public class JasonlessProperties {

    private String name = "jasonless";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
