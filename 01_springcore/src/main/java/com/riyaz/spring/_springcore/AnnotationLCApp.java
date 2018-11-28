package com.riyaz.spring._springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.model.AnnotationPatient;

public class AnnotationLCApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/riyaz/spring/resources/annotationLCConfig.xml");

		AnnotationPatient p = ctx.getBean("a_patient", AnnotationPatient.class);
		System.out.println(p.getId());
		ctx.close();
	}

}
