package com.riyaz.spring.springjdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/riyaz/spring/springjdbc/config.xml");
		JdbcTemplate tmp = ctx.getBean("jdbcTemplate", JdbcTemplate.class);

		String sql = "insert into employee values(?,?,?)";
		
		int result = tmp.update(sql, 1, "Riyaz", "Hamidon");
		
		System.out.println("no of records inserted: " + result);
		ctx.close();
	}
}
