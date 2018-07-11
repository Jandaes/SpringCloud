package com.liujilu.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Janda
 * @date 2018/7/11 0011
 */
@RestController
public class HiClientController {
    private Logger logger = LoggerFactory.getLogger(HiClientController.class);

    /**
     * 获取配置中的属性
     */
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hi")
    public String home(@RequestParam String name){
        logger.info("Port："+ port + "  Name:"+name);
        return "hi " + name + ", I am form port:"+port;
    }
}
