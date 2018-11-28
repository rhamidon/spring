package com.riyaz.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + "]";
	}

}
