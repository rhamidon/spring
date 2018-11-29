package com.riyaz.spring.springjdbc.employee.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riyaz.spring.springjdbc.employee.dao.EmployeeDAO;
import com.riyaz.spring.springjdbc.employee.dto.Employee;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/riyaz/spring/springjdbc/employee/app/config.xml");
		EmployeeDAO empDao = ctx.getBean("empDao", EmployeeDAO.class);

		// int result = empDao.create(new Employee(4, "Marco", "Reus"));
		// System.out.println("records inserted: " + result);
		// int update_result = empDao.update(new Employee(1, "James", "Rodriguez"));
		// System.out.println("records updated: " + update_result);
		// int delete_result = empDao.delete(4);
		// System.out.println("records deleted: " + delete_result);
		// System.out.println(empDao.read(1));
		for (Employee e : empDao.read())
			System.out.println(e);
		ctx.close();
	}
}
