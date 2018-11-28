package com.riyaz.spring.springcoreadvanced.annotationconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/riyaz/spring/springcoreadvanced/annotationconfig/config.xml");
		
		Instructor it = ctx.getBean("inst", Instructor.class);
		Instructor it2 = ctx.getBean("inst", Instructor.class);
		
		System.out.println(it);
		System.out.println(it == it2);
		
		ctx.close();
	}

}
