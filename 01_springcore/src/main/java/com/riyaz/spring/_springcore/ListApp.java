package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.Hospital;

public class ListApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/config.xml");
		Hospital h = ctx.getBean("hospital", Hospital.class);
		System.out.println("----------- " + h.getName() + " -----------");
		for (String dp : h.getDepartments())
			System.out.println(dp);
		ctx.close();
	}

}
