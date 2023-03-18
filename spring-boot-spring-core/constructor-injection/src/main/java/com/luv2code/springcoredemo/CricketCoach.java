package com.luv2code.springcoredemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyworkout() {
        return "Practice fast balling for 15 mins!!!";
    }
}
