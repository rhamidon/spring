package com.riyaz.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl2() createOrder()");
	}

}
