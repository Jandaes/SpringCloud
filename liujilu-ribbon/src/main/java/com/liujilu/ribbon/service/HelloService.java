package com.liujilu.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *  通过注入的IOC容器restTemplate 来消费service-hi的服务接口
 * @author D.Yang
 * @date 2018/7/10 0010
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        System.out.println("Ribbon Service："+name);
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+ name + ", Sorry ,error!";
    }
}
