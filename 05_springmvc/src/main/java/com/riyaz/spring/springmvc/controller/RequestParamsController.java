package com.riyaz.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/params")
public class RequestParamsController {
	
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, 
			@RequestParam("name") String name, @RequestParam(name="sal", required=false, defaultValue="1000") double salary) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		return new ModelAndView("hello");
	}
}
