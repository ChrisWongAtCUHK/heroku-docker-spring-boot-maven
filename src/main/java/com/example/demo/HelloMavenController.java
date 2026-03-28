package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloMavenController {
    @GetMapping
    public String helloMaven() {
        // http://localhost:8080/
        return "Hello Maven!";
    }
}
