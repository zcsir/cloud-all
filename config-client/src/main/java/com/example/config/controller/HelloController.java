package com.example.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class HelloController {


        @Value("${test}")
        String foo;

        @ResponseBody
        @RequestMapping(value = "/hi")
        public String hi(){
            return foo;
        }

    }
