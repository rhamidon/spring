package com.riyaz.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.riyaz.spring.springjdbc.employee.dao.EmployeeDAO;
import com.riyaz.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.riyaz.spring.springjdbc.employee.dto.Employee;

@Component("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
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

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
