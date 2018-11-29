package com.riyaz.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.riyaz.spring.springjdbc.employee.dao.EmployeeDAO;
import com.riyaz.spring.springjdbc.employee.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee e) {
		String sql = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, e.getId(), e.getFirstName(), e.getLastName());
	}

	@Override
	public int update(Employee e) {
		String sql = "update employee set firstname=?,lastname=? where id=?";
		return jdbcTemplate.update(sql, e.getFirstName(), e.getLastName(), e.getId());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
