package com.example.ironhack.labweek4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // /hello returns "Hello World!"
    @GetMapping("/hello")
    public String greeting() {
        return "Hello World!";
    }

    // /hello/name returns "Hello {name}!"
    @GetMapping("/hello/{name}")
    public String greetingWithName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // /add/{num1}/{num2} returns {num1} + {num2}
    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    // /multiply/{num1}/{num2} returns {num1} * {num2}
    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
}
