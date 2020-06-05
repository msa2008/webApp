package com.citi.webapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {
	public String greet(String secure, String name) {
		return "Good Morning,  " + secure + ", " + name;
	}
}
