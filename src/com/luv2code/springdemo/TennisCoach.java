package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component - To find Spring within the component scan that which classes are beans
 * thatSillyCoach - bean id
 */
@Component
public class TennisCoach implements Coach {
    
    private FortuneService fortuneService;

    /**
     * @Autowired - lets spring find the implementation of FortuneService
     * creates the bean and automatically injects here
     */
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
