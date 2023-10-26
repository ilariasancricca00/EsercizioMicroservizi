/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.gammainnovation.MicroServ2.model;

import javax.persistence.*;

/**
 *
 * @author fb97t
 */

@Entity
public class WeatherCondition {
    
    @Id @GeneratedValue
    private Long id;
    String content;
    
    public WeatherCondition() {
        super();
    }
    
    public WeatherCondition(String content) {
        this();
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
