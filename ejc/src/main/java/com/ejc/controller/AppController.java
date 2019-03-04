package com.ejc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	public AppController() {

		System.out.println("AppController");
	}

	
	@RequestMapping("/")
	public ModelAndView welcome() {
		System.out.println("Inside welcome");
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/first_action")
	private ModelAndView name() {
		
		return new ModelAndView("index", "msg", "Sucess ");
		
	}
	
	
	

}
