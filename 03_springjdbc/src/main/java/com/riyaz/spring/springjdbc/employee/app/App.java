package com.riyaz.spring.springjdbc.employee.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.springjdbc.employee.dao.EmployeeDAO;
import com.riyaz.spring.springjdbc.employee.dto.Employee;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/springjdbc/employee/app/config.xml");
		EmployeeDAO empDao = ctx.getBean("empDao", EmployeeDAO.class);
		int result = empDao.create(new Employee(3, "Max", "Meyer"));
		System.out.println("records inserted: " + result);
		ctx.close();
	}

}
