/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.gammainnovation.esercizioMicroservizi;


import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ilari
 */
@Controller
public class MicroServ4Controller {
    
    private float lon, lat;
    
    @RequestMapping("/weather")
    public String weather()
    {
        return "FrontPage";
    }
    
    @RequestMapping("/results")
    public String showResults(
            Map<String, Object> model,
            @RequestBody ResponseEntity<String> response
    ) {
        model.put("response", response);
        return "SearchResults";
    }
}
