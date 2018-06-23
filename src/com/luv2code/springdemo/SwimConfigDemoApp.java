package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

    public static void main(String[] args) {

//        Read the spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//        Retrieve the bean from Spring container
        // Using SwimCoach instead of Coach just to use getEmail, getTeam
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

//        Call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

//        Close the context
        context.close();
    }
}
