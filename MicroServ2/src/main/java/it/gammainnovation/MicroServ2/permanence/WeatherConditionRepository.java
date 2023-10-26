/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.gammainnovation.MicroServ2.permanence;

import org.springframework.data.repository.CrudRepository;
import it.gammainnovation.MicroServ2.model.WeatherCondition;

/**
 *
 * @author fb97t
 */
public interface WeatherConditionRepository extends CrudRepository<WeatherCondition, Long> {
    
    public WeatherCondition findByCoordinates(float longitudine, float latitudine);
    
}
