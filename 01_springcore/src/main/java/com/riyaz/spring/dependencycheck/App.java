package com.riyaz.spring.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/riyaz/spring/dependencycheck/config.xml");

		Prescription p = ctx.getBean("prescription", Prescription.class);
		System.out.println(p.getId());
		ctx.close();
	}

}
