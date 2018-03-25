package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Component - To find Spring within the component scan that which classes are beans
 * thatSillyCoach - bean id
 */
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: Inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
