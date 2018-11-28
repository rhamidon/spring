package com.riyaz.spring.model;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println(">> inside setter");
		this.id = id;
	}
	
	public void init() {
		System.out.println(">> init Patient object");
	}
	
	public void destroy() {
		System.out.println(">> destroy Patient object");
	}
}
