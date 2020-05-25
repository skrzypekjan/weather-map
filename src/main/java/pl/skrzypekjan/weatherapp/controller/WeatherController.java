package pl.skrzypekjan.weatherapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import pl.skrzypekjan.weatherapp.service.WeatherService;

@Controller
public class WeatherController {
    private WeatherService service;

    public WeatherController(WeatherService service) {
        this.service = service;
    }

    @GetMapping("/{city}")
    public String getWeatherByCity(Model model, @PathVariable String city){
        model.addAttribute("weather", service.getWether(city));
        return "weather";
    }
}
