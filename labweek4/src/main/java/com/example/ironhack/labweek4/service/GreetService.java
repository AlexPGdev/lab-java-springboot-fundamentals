package com.example.ironhack.labweek4.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
