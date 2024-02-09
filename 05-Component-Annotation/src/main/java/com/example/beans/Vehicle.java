package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void hello(){
        this.name="Honda";
    }

    public void sayHello(){
        System.out.println("Hello from Component Bean!");
    }
}
