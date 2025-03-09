 package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//GET HTTP method
	// http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")
	public String helloword() {
		return "hello world";
		
	}

}
