package pl.skrzypekjan.weatherapp.config;

import pl.skrzypekjan.weatherapp.model.*;

public class WetherConfig {
    Coord coord;
    Sys sys;
    Clouds clouds;
    Main main;
    Wind wind;
    WeatherAll weatherAll;
    ApiConfig apiConfig;

    public WetherConfig() {
    }

    //Cords
    Double lat = coord.getLat();
    Double lon = coord.getLon();

    //Country code
    String countryCode = sys.getCountry();

    //Sunrise time, unix, UTC
    Integer sunrise = sys.getSunrise();
    Integer sunset = sys.getSunset();

    //Cloudiness in %
    Integer cloudiness = clouds.getAll();

    //Temperature
    Double maxTemp = main.getTempMax();
    Double minTemp = main.getTempMin();
    Double sensedTemp = main.getFeelsLike();
    Double temp = main.getTemp();

    //Wind
    Double speed = wind.getSpeed();

    //Map key
    String mapKey = apiConfig.getMapKey();

    //Weather scene
    public String getWeatherScene() {
        int id = weatherAll.getWeather().get(0).getId();
        if (id >= 200 && id < 232) {
            return "http://openweathermap.org/img/wn/11d@2x.png";
        } else if (id >= 300 && id < 321) {
            return "http://openweathermap.org/img/wn/09d@2x.png";
        } else if (id >= 500 && id < 504) {
            return "http://openweathermap.org/img/wn/10d@2x.png";
        } else if (id == 511) {
            return "http://openweathermap.org/img/wn/13d@2x.png";
        } else if (id >= 520 && id < 531) {
            return "http://openweathermap.org/img/wn/09d@2x.png";
        } else if (id >= 600 && id < 622) {
            return "http://openweathermap.org/img/wn/13d@2x.png";
        } else if (id >= 701 && id < 781) {
            return "http://openweathermap.org/img/wn/50d@2x.png";
        } else if (id == 800) {
            return "http://openweathermap.org/img/wn/01d@2x.png";
        } else if (id == 801) {
            return "http://openweathermap.org/img/wn/02d@2x.png";
        } else if (id == 802) {
            return "http://openweathermap.org/img/wn/03d@2x.png";
        } else if (id == 803 || id == 804) {
            return "http://openweathermap.org/img/wn/04d@2x.png";
        } else {
            return null;
        }
    }

    public Coord getCoord() {
        return coord;
    }

    public Sys getSys() {
        return sys;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public WeatherAll getWeatherAll() {
        return weatherAll;
    }

    public ApiConfig getApiConfig() {
        return apiConfig;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public Integer getCloudiness() {
        return cloudiness;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public Double getSensedTemp() {
        return sensedTemp;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getSpeed() {
        return speed;
    }

    public String getMapKey() {
        return mapKey;
    }
}
