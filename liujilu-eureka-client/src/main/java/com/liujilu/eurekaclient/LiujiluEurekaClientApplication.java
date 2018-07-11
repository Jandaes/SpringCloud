package com.liujilu.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建一个服务，注册到服务中心
 * @author Administrator
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class LiujiluEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiujiluEurekaClientApplication.class, args);
	}
}
