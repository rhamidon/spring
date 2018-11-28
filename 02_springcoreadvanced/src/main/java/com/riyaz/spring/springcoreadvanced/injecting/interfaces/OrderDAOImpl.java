package com.riyaz.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO() createOrder()");
	}

}
