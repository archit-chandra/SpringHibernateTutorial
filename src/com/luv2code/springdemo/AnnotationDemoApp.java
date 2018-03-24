package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

//        Read the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Retrieve the bean from Spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

//        Call methods on the bean
        System.out.println(coach.getDailyWorkout());

//        Close the context
        context.close();
    }
}
