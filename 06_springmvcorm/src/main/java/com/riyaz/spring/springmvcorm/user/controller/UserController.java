package com.riyaz.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.riyaz.spring.springmvcorm.user.entity.User;
import com.riyaz.spring.springmvcorm.user.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("/register")
	public String showForm() {
		return "user-registration";
	}
	
	@RequestMapping(value="/processRegister", method=RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "user created with id: " + result);
		return "user-registration";
	}
}
