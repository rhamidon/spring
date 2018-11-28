package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// load the container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/config.xml");
		
		// get a bean
		Employee emp = (Employee) ctx.getBean("emp");
		Employee emp1 = (Employee) ctx.getBean("emp");
		System.out.println(emp.getId() + ": " + emp.getName());
		
		// close the container
		System.out.println(emp == emp1);
		ctx.close();
	}
}
