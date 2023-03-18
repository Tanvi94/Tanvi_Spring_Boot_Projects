package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//For scanning classes or beans which are in different package than base package where springboot application class contains
//@SpringBootApplication(scanBasePackages = {"com.luv2code.springcoredemo","com.luv2code.util"})
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
