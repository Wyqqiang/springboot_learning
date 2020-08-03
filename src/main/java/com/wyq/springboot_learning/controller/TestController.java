package com.wyq.springboot_learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        hello();
        return "index";
    }

    public void hello(){
        System.out.println("haha--------------");
    }
}
