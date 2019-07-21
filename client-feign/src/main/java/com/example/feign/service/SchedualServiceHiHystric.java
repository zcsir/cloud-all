package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HelloService {
    @Override
    public String hiService(String name) {
        return "sorry "+name;
    }
}
