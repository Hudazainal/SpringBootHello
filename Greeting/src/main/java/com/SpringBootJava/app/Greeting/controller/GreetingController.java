package com.SpringBootJava.app.Greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping(value="/")
	//@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello() {
		return "hello";
	}

}
