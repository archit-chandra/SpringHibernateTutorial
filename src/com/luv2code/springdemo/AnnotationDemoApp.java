package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

//        Read the spring config file
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//        Retrieve the bean from Spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach otherCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("---------------Scope Testing-------------------");
        boolean result = (coach == otherCoach);
        System.out.println("Pointing to the same object   : " + result);
        System.out.println("Memory location of coach      : " + coach);
        System.out.println("Memory location of otherCoach : " + otherCoach);
        System.out.println("---------------Scope Testing-------------------");

//        Call methods on the bean
        System.out.println(coach.getDailyWorkout());
        // after injection of FortuneService
        System.out.println(coach.getDailyFortune());

//        Close the context
        context.close();
    }
}
