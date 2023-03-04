package com.Bikkadit.SpringMVCwithHibernate2.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Bikkadit.SpringMVCwithHibernate2.model.Employee;
@Repository
public interface EmployeeDaoi {
	
	public int SaveEmployee(Employee emp);
	
	 public List<Employee> GetEmployeeLIst();
}
