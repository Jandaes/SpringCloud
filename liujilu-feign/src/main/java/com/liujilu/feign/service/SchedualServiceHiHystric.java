package com.liujilu.feign.service;

import org.springframework.stereotype.Component;

/**
 *
 * @author D.Yang
 * @date 2018/7/10 0010
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
