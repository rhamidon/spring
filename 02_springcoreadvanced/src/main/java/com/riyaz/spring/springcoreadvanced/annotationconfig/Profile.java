package com.riyaz.spring.springcoreadvanced.annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("Java Architect")
	private String title;
	
	@Value("Vivekananda Consulting")
	private String company;

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

}
