package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    @Autowired
    public DemoController(Coach ch){
        myCoach=ch;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout(){
        return myCoach.getDailyworkout();
    }
}
