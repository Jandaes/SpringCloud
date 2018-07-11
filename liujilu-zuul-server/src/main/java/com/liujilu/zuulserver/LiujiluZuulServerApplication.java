package com.liujilu.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 开启zuul代理注册功能
 * @author Administrator
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class LiujiluZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiujiluZuulServerApplication.class, args);
	}
}
