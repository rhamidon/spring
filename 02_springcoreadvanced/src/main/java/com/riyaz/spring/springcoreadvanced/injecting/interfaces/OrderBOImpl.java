package com.riyaz.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderBo")
public class OrderBOImpl implements OrderBO {
	
	@Autowired
	// @Qualifier("orderDao")
	@Qualifier("orderDao2")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO()");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
