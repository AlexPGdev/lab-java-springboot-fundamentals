package com.example.ironhack.labweek4.controller;

import com.example.ironhack.labweek4.model.Weather;
import com.example.ironhack.labweek4.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int getTemperature() {
        return weatherService.getTemperature();
    }

    @GetMapping("/condition")
    public String getCondition() {
        return weatherService.getCondition();
    }

    @GetMapping("/wind")
    public int getWindSpeed() {
        return weatherService.getWindSpeed();
    }

    @GetMapping("/all")
    public Weather getWeather() {
        return weatherService.getWeather();
    }
}
