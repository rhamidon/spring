package com.riyaz.spring.constructorinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/constructorinjection/config.xml");
		
		Employee e = ctx.getBean("emp", Employee.class);
		System.out.println(e);
		ctx.close();
	}

}
