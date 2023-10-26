/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.gammainnovation.esercizioMicroservizi;


import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ilari
 */
@Controller
public class MicroServ4Controller {
    
    @RequestMapping("/weather") 
    public String weather()
    {
        return "FrontPage";
    }
    
    @RequestMapping("/weather/getweather")
    public String sendRequest(
            @RequestParam float lon,
            @RequestParam float lat,
            Map<String,Object> model
    ) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/weather/getweather?lon=" + lon + "&lat=" + lat,String.class);
        model.put("response", response);
        return "SearchResults";
    }
}
