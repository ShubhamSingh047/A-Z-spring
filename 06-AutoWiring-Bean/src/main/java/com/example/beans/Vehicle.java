package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void hello(){
        this.name="Honda";
    }

    public void sayHello(){
        System.out.println("Hello from Component Bean!");
    }


    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}
