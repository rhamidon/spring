package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.Patient;

public class XMLLCApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/xmlLCConfig.xml");
		
		Patient p = ctx.getBean("patient", Patient.class);
		System.out.println(p.getId());
		
		ctx.registerShutdownHook();
		// ctx.close();
	}

}
