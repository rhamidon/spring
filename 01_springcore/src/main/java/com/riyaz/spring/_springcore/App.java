package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		System.out.println(emp.getId() + ": " + emp.getName());
		
		// close the container
		ctx.close();
	}
}
