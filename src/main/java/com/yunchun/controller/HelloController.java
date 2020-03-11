package com.yunchun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("com.yunchun.controller.HelloController")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
