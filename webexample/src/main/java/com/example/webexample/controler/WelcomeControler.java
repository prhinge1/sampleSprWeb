package com.example.webexample.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeControler {
	
	@RequestMapping("/welcome")
	public String getWelcomePage() {
		System.out.println("Hi");
		return "/welcome";
	}

}
