package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[] args) {



        //using spring container context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //below line will give an exception as getBeans has all the Beans with same Object name
        //Vehicle vehicle=context.getBean(Vehicle.class);

        //Correction of beans
        Vehicle veh1=context.getBean(Vehicle.class);
        System.out.println("Vehicle 1 name from spring context is : "+veh1.getName());
        veh1.sayHello();
    }
}
