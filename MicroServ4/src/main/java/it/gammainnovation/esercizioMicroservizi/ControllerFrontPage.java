/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.gammainnovation.esercizioMicroservizi;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ilari
 */
@Controller
public class ControllerFrontPage {
    @RequestMapping("/weather") 
    
    public String weather()
    {
        return "FrontPage";
    }
}
