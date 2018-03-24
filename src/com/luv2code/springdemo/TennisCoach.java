package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * @Component - To find Spring within the component scan that which classes are beans
 * thatSillyCoach - bean id
 */
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
}
