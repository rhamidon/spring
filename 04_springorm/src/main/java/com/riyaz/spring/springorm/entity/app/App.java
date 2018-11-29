package com.riyaz.spring.springorm.entity.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.springorm.product.dao.ProductDao;
import com.riyaz.spring.springorm.product.dao.impl.ProductDaoImpl;
import com.riyaz.spring.springorm.product.entity.Product;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/riyaz/spring/springorm/entity/app/config.xml");
		ProductDao dao = (ProductDao) ctx.getBean("productDao");

		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDesc("iPhone 7 Plus Red");
		product.setPrice(799.99);
		
		// dao.create(product);
		// dao.update(product);
		// dao.delete(product);
		// System.out.println(dao.find(3));
		for (Product p : dao.findAll())
			System.out.println(p);
		ctx.close();
	}

}
