package edu.springbootexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@RequestMapping("/hello")
	public String sayHi(){
		return "Hello";
	}
	
	//@RequestMapping("/error")
	public String printError(){
		return "THis is due to some error occured";
	}
	
	
	
}
