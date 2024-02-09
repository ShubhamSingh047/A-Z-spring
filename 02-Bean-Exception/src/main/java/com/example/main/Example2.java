package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {



        //using spring container context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //below line will give an exception as getBeans has all the Beans with same Object name
        //Vehicle vehicle=context.getBean(Vehicle.class);

        //Correction of beans
        Vehicle veh1=context.getBean("vehicle1",Vehicle.class);
        Vehicle veh2=context.getBean("vehicle2",Vehicle.class);

        System.out.println("Vehicle name from spring context is : "+veh1.getName());
        System.out.println("Vehicle name from spring context is : "+veh2.getName());
    }
}
