package it.mycompany.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// I am depending from an interface on a higher level ==> GOOD (DIP principle)
import it.mycompany.demo.controllers.MyService;

@Service
@Primary
public class MyServiceImpl2 implements MyService {
	
	/**
	 * This is a very complex logic and has to be put into this separate component code
	 * @param name
	 * @return
	 */
	public String getMyMessage(String name) {
		// Return some "fake JSON"
		return "<message>Hello "+name+" from Spring Boot!</message>";
	}

}
