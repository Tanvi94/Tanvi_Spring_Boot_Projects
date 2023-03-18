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
    public DemoController(@Qualifier("cricketCoach") Coach ch,@Qualifier("cricketCoach") Coach theanotherCoach){
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach = ch;
        anotherCoach = theanotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyworkout(){
        return myCoach.getDailyworkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans myCoach and anotherCoach:  " + (myCoach == anotherCoach);
    }
}
