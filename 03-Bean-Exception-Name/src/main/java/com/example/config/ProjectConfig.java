package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    //all three ways can be used to avoid no unique exception beans
    @Bean(name="AudiVehicle")
    Vehicle vehicle1(){
        var veh= new Vehicle();
        veh.setName("Audio 8");
        return veh;
    }

    @Bean(value = "BmwVehicle")
    Vehicle vehicle2(){
        var veh= new Vehicle();
        veh.setName("Bmw");
        return veh;
    }

    @Bean("HondaVechile")
    Vehicle vehicle3(){
        var veh= new Vehicle();
        veh.setName("Honda");
        return veh;
    }

}
