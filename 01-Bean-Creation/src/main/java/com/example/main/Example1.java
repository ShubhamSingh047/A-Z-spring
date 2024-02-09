package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
    //without using spring beans and without taking help of IOC container
        Vehicle veh=new Vehicle();
        veh.setName("honda civic");
        System.out.println();
        System.out.println("Vehicle name from non-spring context is: "+veh.getName());

        //using spring container context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is : "+vehicle.getName());

        String hello=context.getBean(String.class);
        System.out.println(hello);
    }
}
