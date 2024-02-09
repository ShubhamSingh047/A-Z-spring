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
        Vehicle veh1=context.getBean("AudiVehicle",Vehicle.class);
        Vehicle veh2=context.getBean("BmwVehicle",Vehicle.class);
        Vehicle veh3=context.getBean("HondaVechile",Vehicle.class);

        System.out.println("Vehicle 1 name from spring context is : "+veh1.getName());
        System.out.println("Vehicle 2 name from spring context is : "+veh2.getName());
        System.out.println("Vehicle 3 name from spring context is : "+veh3.getName());
    }
}
