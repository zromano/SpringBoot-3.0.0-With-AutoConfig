package com.lib.root;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "can-you-find-me")
    Object testObject() {
        System.out.println("Bean in Lib was created!");
        return new Object();
    }
}
