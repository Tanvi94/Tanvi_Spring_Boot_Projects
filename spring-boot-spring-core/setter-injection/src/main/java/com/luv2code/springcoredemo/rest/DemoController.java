package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    //setter injection
    @Autowired
    public void setCoach(Coach ch){
        myCoach = ch;
    }
    @GetMapping("/dailyworkout")
    public String getDailyworkout(){
        return myCoach.getDailyworkout();
    }
}