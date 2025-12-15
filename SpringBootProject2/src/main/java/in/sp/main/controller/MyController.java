package in.sp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
    @GetMapping("/")
    @ResponseBody
	public String printHello() {
		return "Hello Hardik";
	}
}
