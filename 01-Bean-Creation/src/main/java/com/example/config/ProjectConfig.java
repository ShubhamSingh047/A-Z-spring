package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vechile(){
        var veh= new Vehicle();
        veh.setName("audio 8");
        return veh;
    }

    @Bean
    String greatings(){
        return "Hello there !";
    }

}
