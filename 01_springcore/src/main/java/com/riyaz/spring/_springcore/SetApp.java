package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.CarDealer;

public class SetApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/config.xml");
		
		CarDealer cd = ctx.getBean("cardealer", CarDealer.class);
		
		System.out.println(cd.getName());
		for (String md : cd.getModels())
			System.out.println(md);
		System.out.println(cd.getModels().getClass());
		ctx.close();
	}

}
