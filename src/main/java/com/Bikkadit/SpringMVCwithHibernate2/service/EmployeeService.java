package com.Bikkadit.SpringMVCwithHibernate2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Bikkadit.SpringMVCwithHibernate2.model.Employee;
@Service
public interface EmployeeService {
	
      public int SaveEmployee(Employee emp);
      
      public List<Employee> GetEmployeeLIst();
}
