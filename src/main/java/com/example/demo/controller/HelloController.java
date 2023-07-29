package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/helloo")
	public String helloAll()
	{
		log.info("Printing to check logger");
		return "Hello";
	}
	
	
	
}
