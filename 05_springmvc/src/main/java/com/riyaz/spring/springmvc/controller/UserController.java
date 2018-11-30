package com.riyaz.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/register")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("user-registration");
		return mv;
	}
}
