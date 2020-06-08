package com.chow.feignclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WeatherFallback implements IWeatherClient {
 
    @Override
    public ResponseEntity<Map> getWeather() {
        return null;
    }

}
