package com.riyaz.spring.springcoreadvanced.annotationconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/riyaz/spring/springcoreadvanced/annotationconfig/config.xml");
		Instructor it = ctx.getBean("instructor", Instructor.class);
		System.out.println(it);
		ctx.close();
	}

}
