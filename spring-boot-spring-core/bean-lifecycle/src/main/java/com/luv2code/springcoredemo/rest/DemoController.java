package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    //setter injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach ch) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = ch;

    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout() {
        return myCoach.getDailyworkout();
    }

}
