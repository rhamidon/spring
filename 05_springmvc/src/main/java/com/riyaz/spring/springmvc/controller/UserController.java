package com.riyaz.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.riyaz.spring.springmvc.dto.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/register")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("user-registration");
		return mv;
	}
	
	@RequestMapping(value="/processRegister", method=RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView mv = new ModelAndView("user-registration");
		return mv; 
	}
}
