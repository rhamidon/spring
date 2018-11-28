package com.riyaz.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				// "com/riyaz/spring/springcoreadvanced/injecting/interfaces/config.xml");
				"com/riyaz/spring/springcoreadvanced/injecting/interfaces/annotaionconfig.xml");
		
		OrderBO ob = (OrderBO) ctx.getBean("orderBo");
		ob.placeOrder();
		ctx.close();
	}

}
