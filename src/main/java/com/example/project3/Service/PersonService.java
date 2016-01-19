package com.example.project3.Service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")

@Configuration
public class PersonService {

	private String message ;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void sentMessage(String message) {
		this.message = message;
		
	}

}
