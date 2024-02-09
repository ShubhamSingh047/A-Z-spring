package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    //Primary Annotation (default annotation)
    Vehicle vehicle1(){
        var veh= new Vehicle();
        veh.setName("Audio 8");
        return veh;
    }


    Vehicle vehicle2(){
        var veh= new Vehicle();
        veh.setName("Bmw");
        return veh;
    }



    Vehicle vehicle3(){
        var veh= new Vehicle();
        veh.setName("Honda");
        return veh;
    }

}
