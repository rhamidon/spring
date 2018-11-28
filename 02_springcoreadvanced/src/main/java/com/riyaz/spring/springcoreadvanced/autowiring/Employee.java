package com.riyaz.spring.springcoreadvanced.autowiring;

public class Employee {
	private Address address;
	private String name;

	public Employee(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + "]";
	}

}
