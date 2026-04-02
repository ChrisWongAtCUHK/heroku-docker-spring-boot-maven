package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMavenController {
    @GetMapping
    public String helloMaven(Model model) {
        model.addAttribute("name", "User");
        return "welcome"; // Looks for welcome.ftlh or welcome.ftl
    }
}
