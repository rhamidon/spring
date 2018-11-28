package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.CountriesAndLanguages;

public class PropApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/config.xml");
		CountriesAndLanguages cl = ctx.getBean("clang", CountriesAndLanguages.class);
		System.out.println(cl);
		ctx.close();
	}

}
