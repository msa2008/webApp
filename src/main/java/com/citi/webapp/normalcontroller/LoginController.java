package com.citi.webapp.normalcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.citi.webapp.service.GreeterService;

@Controller
@RequestMapping(value = "/normal")
public class LoginController {

	@Autowired
	private GreeterService greeterService;

	@RequestMapping(method = RequestMethod.GET)
	public String helloAgain(ModelMap map) {
		map.addAttribute("name", greeterService.greet("normal", "Mayur"));
		return "welcome";
	}
}
