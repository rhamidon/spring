package com.riyaz.spring.springjdbc.employee.dao;

import com.riyaz.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	int create(Employee e);
	int update(Employee e);
	int delete(int id);
}
