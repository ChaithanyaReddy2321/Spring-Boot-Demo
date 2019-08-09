package com.tricon.demoSpringBoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.Employee;
import com.tricon.demoSpringBoot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empSer;
	
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	public Employee getEmployees(@PathVariable(name = "id") int id){
		
		return empSer.getEmplyeeService(id);
	}
	
	@RequestMapping(value = "/inEmp", method = RequestMethod.POST)
	public int insertEmployee(@RequestBody Employee emp) {
		
		return empSer.insertEmployeeService(emp);
	}
	
	@RequestMapping(value = "/putEmp", method = RequestMethod.PUT)
	public int updateEmployee(@RequestBody Employee emp) {
		
		return empSer.updateEmployeeSalaryService(emp);
	}
	
}

