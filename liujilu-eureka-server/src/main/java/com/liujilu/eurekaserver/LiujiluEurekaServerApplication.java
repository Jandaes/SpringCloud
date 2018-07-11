package com.liujilu.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class LiujiluEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiujiluEurekaServerApplication.class, args);
	}
}
