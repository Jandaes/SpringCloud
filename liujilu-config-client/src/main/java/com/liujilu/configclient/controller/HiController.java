package com.liujilu.configclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author D.Yang
 * @date 2018/7/11 0011
 */
@RestController
public class HiController {
    private Logger logger = LoggerFactory.getLogger(HiController.class);

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/hi")
    public String hi(){
        logger.info("Config-client: "+ foo);
        return foo;
    }
}
