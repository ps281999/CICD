package com.example.dmapimspringjspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping("/home")
	public String loginPage() {
		return "login";
	}
	

}
