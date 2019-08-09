package com.tricon.demoSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.Employee;
import com.tricon.demoSpringBoot.dao.EmplyeeDetails;

@Service
public class EmployeeService {
	
	@Autowired
	EmplyeeDetails empDtls;

	public Employee getEmplyeeService(int id) {
		
		return empDtls.getEmployeeDao(id);
	}
	
	public int insertEmployeeService(Employee emp) {
		
		return empDtls.insertEmployee(emp);
	}
	
	public int updateEmployeeSalaryService(Employee emp) {
		
		return empDtls.updateEmployeeSalary(emp);
	}
}
