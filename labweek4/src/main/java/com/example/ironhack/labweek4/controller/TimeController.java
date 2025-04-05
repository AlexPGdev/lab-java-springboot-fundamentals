package com.example.ironhack.labweek4.controller;

import com.example.ironhack.labweek4.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current time is " + timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getCurrentDate() {
        return "Current date is " + timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDayOfWeek() {
        return "Today is " + timeService.getDayOfWeek();
    }

    @GetMapping("/all")
    public String getAll() {
        return timeService.getAll();
    }
}
