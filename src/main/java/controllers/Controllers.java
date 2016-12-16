package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	@RequestMapping("/index")
	public String Home(){
		return "Hello";
	}
	
}
