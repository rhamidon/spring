package com.riyaz.spring.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.riyaz.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/listEmployee")
	public String sendList(ModelMap model) {
		List<Employee> emps = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setId(123);
		emp1.setName("John Doe");
		emp1.setSalary(12000.00);
		Employee emp2 = new Employee();
		emp2.setId(124);
		emp2.setName("Jane Doe");
		emp2.setSalary(8000.00);
		Employee emp3 = new Employee();
		emp3.setId(125);
		emp3.setName("Jean Doe");
		emp3.setSalary(30000.00);
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);

		model.addAttribute("employees", emps);
		return "display-list";
	}
}
