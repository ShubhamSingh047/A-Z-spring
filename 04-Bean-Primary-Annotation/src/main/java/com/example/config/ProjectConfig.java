package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    //Primary Annotation (default annotation)
    @Bean
    Vehicle vehicle1(){
        var veh= new Vehicle();
        veh.setName("Audio 8");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh= new Vehicle();
        veh.setName("Bmw");
        return veh;
    }

    @Primary
    @Bean
    Vehicle vehicle3(){
        var veh= new Vehicle();
        veh.setName("Honda");
        return veh;
    }

}
