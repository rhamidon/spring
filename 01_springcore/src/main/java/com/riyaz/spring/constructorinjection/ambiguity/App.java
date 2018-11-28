package com.riyaz.spring.constructorinjection.ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/constructorinjection/ambiguity/config.xml");
		
		Addition e = ctx.getBean("addition", Addition.class);
		System.out.println(e);
		ctx.close();
	}

}
