package com.riyaz.spring.springjdbc.employee.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/riyaz/spring/springjdbc/config.xml");
		JdbcTemplate tmp = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		ctx.close();
	}

}
