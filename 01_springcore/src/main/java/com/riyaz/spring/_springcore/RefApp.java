package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.Student;

public class RefApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/resources/refConfig.xml");
		
		Student s = ctx.getBean("student", Student.class);
		System.out.println(s.getName());
		System.out.println(s.getScores());
		
		ctx.close();
	}

}
