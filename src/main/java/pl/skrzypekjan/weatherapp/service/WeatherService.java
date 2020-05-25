package pl.skrzypekjan.weatherapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.skrzypekjan.weatherapp.config.ApiConfig;
import pl.skrzypekjan.weatherapp.model.WeatherAll;

@Service
public class WeatherService {

    private RestTemplate restTemplate;
    ApiConfig config = new ApiConfig();

    public WeatherService() {
        this.restTemplate = new RestTemplate();
//        WeatherAll object = restTemplate.getForObject(  config.getUrl() + "Sztum" + "&appid=" + config.getKey(), WeatherAll.class);
//        System.out.println(object);
    }

    public WeatherAll getWether(String city){
        WeatherAll weatherAll = restTemplate.getForObject(  config.getUrl() + city + "&appid=" + config.getKey() + "&units=metric", WeatherAll.class);
        return weatherAll;
    }
}
