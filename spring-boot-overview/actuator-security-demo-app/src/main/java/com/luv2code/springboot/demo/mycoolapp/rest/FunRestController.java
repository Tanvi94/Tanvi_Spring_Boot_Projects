package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject properties for coachName and teamName
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //Add "/" endpoint that will simply return Hello World!!
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    //expose new endpoint as /workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 10k";
    }

    //expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Wear a Yellow Shirt Today";
    }

    //expose new endpoint for getting team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){return "Coach name is: "+coachName+" Team name is: "+teamName;}

}
