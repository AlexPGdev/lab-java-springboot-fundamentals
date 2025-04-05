package com.example.ironhack.labweek4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public String greeting() {
        return "Hello World!";
    }

    @GetMapping("{name}")
    public String greetingWithName(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
