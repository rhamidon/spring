package com.riyaz.spring.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.riyaz.spring.springjdbc.employee.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt(1);
		String fn = rs.getString("firstname");
		String ln = rs.getString("lastname");
		return new Employee(id, fn, ln);
	}

}
