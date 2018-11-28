package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.LCPatient;

public class InterfaceLCApp2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/interfaceLCConfig.xml");
		
		LCPatient p = ctx.getBean("lc_patient", LCPatient.class);
		System.out.println(p.getId());
		
		ctx.close();
	}

}
