package com.riyaz.spring.constructorinjection.ambiguity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println(">> constructor double");
	}
	
	public Addition(int a, int b) {
		System.out.println(">> constructor int");
	}
	
	public Addition(String a, String b) {
		System.out.println(">> constructor String");
	}
}
