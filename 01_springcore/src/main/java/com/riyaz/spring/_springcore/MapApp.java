package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.Customer;

public class MapApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/config.xml");
		
		Customer c = ctx.getBean("customer", Customer.class);
		System.out.println(c);
		System.out.println(c.getProducts().getClass());
		ctx.close();
	}

}
