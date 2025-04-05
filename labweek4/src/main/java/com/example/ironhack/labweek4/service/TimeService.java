package com.example.ironhack.labweek4.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


@Service
public class TimeService {

    public LocalTime getCurrentTime() {
        // Show only hh:mm:ss
        return LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
    }

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }

    public String getAll() {
        return "Current Date: " + LocalDate.now() + "\n" +
                "Current Time: " + LocalTime.now() + "\n" +
                "Current Day: " + LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }

}
