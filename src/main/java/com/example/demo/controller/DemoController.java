package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DemoController
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String Demo() {
        return "Welcome Docker On jenkins.";
    }
}