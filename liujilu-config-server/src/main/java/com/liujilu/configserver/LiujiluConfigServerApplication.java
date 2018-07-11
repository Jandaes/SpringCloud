package com.liujilu.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Administrator
 */
@EnableConfigServer
@SpringBootApplication
public class LiujiluConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiujiluConfigServerApplication.class, args);
    }
}
