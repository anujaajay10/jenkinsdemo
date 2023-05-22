package com.ust.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome Anuja";

    }

    @GetMapping("/Anuja")
    public String welcomeAnuja() {
        return "welcome Anuja Ajay";
    }
}
