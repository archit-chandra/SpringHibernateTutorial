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

    @Autowired
    public void doAnyCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: Inside doAnyCrazyStuff() method");
        this.fortuneService = fortuneService;
    }
}
