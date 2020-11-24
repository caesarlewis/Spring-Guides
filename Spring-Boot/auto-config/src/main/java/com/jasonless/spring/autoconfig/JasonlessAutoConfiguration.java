package com.jasonless.spring.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiuShiZeng
 * @since 2020/8/25
 */
@ConditionalOnClass(Jasonless.class)//条件装配
@Configuration
@EnableConfigurationProperties(JasonlessProperties.class)
public class JasonlessAutoConfiguration {

    @Bean
    Jasonless createJasonless(JasonlessProperties jasonlessProperties){
        return new Jasonless(jasonlessProperties.getName());
    }

}
