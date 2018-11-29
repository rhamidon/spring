package com.riyaz.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello");
	}
}
