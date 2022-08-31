package it.mycompany.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	MyService service;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		// Avoid controlling the instance, invert the control, giving it to the context
		// MyService service = new MyService();
		
		return service.getMyMessage(name);
	}
	
}
