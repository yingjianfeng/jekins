package com.yjf.jekins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("test")
    public String get(){
        System.out.println("--------in--------");
        return "test success";
    }


}
