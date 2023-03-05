package com.bits.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/demo")
    public String returnDemo(){
        return "DemoApplication";
    }
    
}
