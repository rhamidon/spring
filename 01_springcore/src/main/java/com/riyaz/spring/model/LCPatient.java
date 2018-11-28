package com.riyaz.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LCPatient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">> on destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">> on init method");
	}

}
