package com.telusko.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
//	@ResponseBody
	public String greet() {
		return "Welcome to telusko ";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "We dont teach";
	}
}
