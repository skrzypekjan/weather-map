package pl.skrzypekjan.weatherapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import pl.skrzypekjan.weatherapp.model.WeatherAll;
import pl.skrzypekjan.weatherapp.service.WeatherService;

@Controller
public class WeatherController {
    private WeatherService service;
    private WeatherAll weatherAll;

    public WeatherController(WeatherService service, WeatherAll weatherAll) {
        this.service = service;
        this.weatherAll = weatherAll;
    }

    @GetMapping
    public String getWeatherByCity(Model model){
        model.addAttribute("weather", service.getWeather("Gdańsk"));
        return "weather";
    }

    @PostMapping
    public String setCity(Model model, String city){
        try {
            model.addAttribute("weather", service.getWeather(city));
            return "weather";
        } catch (HttpClientErrorException e){
            System.out.println(e);
        }
        return "error";
    }
}
