package com.riyaz.spring.springjdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/springjdbc/config.xml");
		ctx.close();
	}
}
