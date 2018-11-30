package com.riyaz.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.riyaz.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/employee")
	public ModelAndView sendObject() {
		ModelAndView mv = new ModelAndView("display-object");
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("John Doe");
		emp.setSalary(12000.00);
		mv.addObject("employee", emp);
		return mv;
	}
}
