package com.citi.webapp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MyContoller {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap map) {
		map.addAttribute("name", "mayur");
		return "welcome";
	}
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String helloAgain(ModelMap map) {
		map.addAttribute("name", "Tejaswini");
		return "welcome";
	}
}
