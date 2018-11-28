package com.riyaz.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationPatient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println(">> inside setter");
		this.id = id;
	}
	
	@PostConstruct
	public void init() {
		System.out.println(">> init Patient object");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println(">> destroy Patient object");
	}
}
