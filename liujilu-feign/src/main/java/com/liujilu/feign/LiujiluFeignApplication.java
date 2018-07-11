package com.liujilu.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 开启Feign功能
 * @author Administrator
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class LiujiluFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiujiluFeignApplication.class, args);
	}
}
