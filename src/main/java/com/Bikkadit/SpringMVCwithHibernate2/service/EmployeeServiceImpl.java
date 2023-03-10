package com.Bikkadit.SpringMVCwithHibernate2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bikkadit.SpringMVCwithHibernate2.dao.EmployeeDaoi;
import com.Bikkadit.SpringMVCwithHibernate2.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
 private EmployeeDaoi employeeDaoi;

	@Override
	public int SaveEmployee(Employee emp) {
		
		int id = employeeDaoi.SaveEmployee(emp);
		return id;
	}

	@Override
	public List<Employee> GetEmployeeLIst() {
		  List<Employee> employeeLIst = employeeDaoi.GetEmployeeLIst();
		return employeeLIst ;
	}
	
}
