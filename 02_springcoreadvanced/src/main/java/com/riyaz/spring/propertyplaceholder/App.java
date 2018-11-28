package com.riyaz.spring.propertyplaceholder;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/propertyplaceholder/config.xml");
		DataDAO dd = ctx.getBean("DataDAO", DataDAO.class);
		System.out.println(dd.getDbServer());
		ctx.close();
	}

}
