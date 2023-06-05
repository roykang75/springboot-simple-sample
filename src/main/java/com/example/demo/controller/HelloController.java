package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "hello world";
    }

    @GetMapping("/hello")
    public String home2() {
        return "hello world";
    }
}
