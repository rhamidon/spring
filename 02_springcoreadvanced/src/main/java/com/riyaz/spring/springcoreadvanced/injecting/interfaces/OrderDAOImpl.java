package com.riyaz.spring.springcoreadvanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO() createOrder()");
	}

}
