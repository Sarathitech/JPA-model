package com.example.demo2.controller;

import jakarta.servlet.http.PushBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
@GetMapping("/")
    public String display(){
        return "Welcome";
    }
}
