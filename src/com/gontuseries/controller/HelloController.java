package com.gontuseries.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg", String.format("Hi %s! You are from %s!", name, country));
		
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg", "Hi, user! Hi World... I'm using annotations...");
		
		return modelAndView;
	}

}
