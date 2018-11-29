package com.riyaz.spring.springorm.product.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.riyaz.spring.springorm.product.dao.ProductDao;
import com.riyaz.spring.springorm.product.entity.Product;

public class ProductDaoImpl implements ProductDao {

	HibernateTemplate hibernateTemplate;
	
	@Override
	public int create(Product product) {
		return 0;
	}

}
