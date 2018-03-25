package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

    public static void main(String[] args) {

//        Read the spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//        Retrieve the bean from Spring container
        Coach coach = context.getBean("swimCoach", Coach.class);

//        Call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

//        Close the context
        context.close();
    }
}
