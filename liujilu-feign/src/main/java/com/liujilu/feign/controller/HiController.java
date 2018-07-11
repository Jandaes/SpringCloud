package com.liujilu.feign.controller;

import com.liujilu.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author D.Yang
 * @date 2018/7/10 0010
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        System.out.println("Feign Controller: "+name);
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}