package com.SpringSecurityBasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurtiyController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello Spring Security";
    }
}
