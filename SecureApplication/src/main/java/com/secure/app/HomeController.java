package com.secure.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	private CrudRepository crudRepository;
	@RequestMapping("/")
	public String getHomePage() {
		return "home.jsp";
	}
	
	
}
