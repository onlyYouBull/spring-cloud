package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer                                 //项目支持config 注解
public class ConfigApplication {
    public static void main(String[] args) {
            SpringApplication.run(ConfigApplication.class,args);
    }
}
