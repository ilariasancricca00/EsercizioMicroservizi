/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.gammainnovation.MicroServ1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mw
 */
@RestController
public class WeatherController {

    @RequestMapping("/weather/getweather")
    public ResponseEntity<String> controller(@RequestParam("lon") float lon,@RequestParam("lat") float lat){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=45ebf042ebabdcb74b446b69c5bfd975",String.class);
        return response;
    }
}
