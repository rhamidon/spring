package com.riyaz.spring.springcoreadvanced.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/springcoreadvanced/autowiring/config.xml");
		
		Employee e = ctx.getBean("emp", Employee.class);
		System.out.println(e);
		ctx.close();
	}

}
