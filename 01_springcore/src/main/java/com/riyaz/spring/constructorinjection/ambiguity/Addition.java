package com.riyaz.spring.constructorinjection.ambiguity;

public class Addition {

	public Addition(int a, double b) {
		System.out.println(">> constructor");
		System.out.println(a + ": " + b);
	}
}
