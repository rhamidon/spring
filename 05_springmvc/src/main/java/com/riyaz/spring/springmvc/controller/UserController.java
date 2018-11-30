package com.riyaz.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.riyaz.spring.springmvc.dto.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/register")
	public String showForm() {
		return "user-registration";
	}

	@RequestMapping(value = "/processRegister", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "registration-result";
	}
}
