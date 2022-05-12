package com.example.pwcspring;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{

	@Autowired
	private DataSource dataSource;
	@PostConstruct
	public void loadData() {
		setDataSource(dataSource);
	}
	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql="insert into employee(empname,email,city)values(?,?,?)";
		getJdbcTemplate().update(sql, new Object[] {employee.getEmpname(),employee.getEmail(),employee.getCity()});
		
	}

}
