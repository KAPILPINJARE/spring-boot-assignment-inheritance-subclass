package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.ContractEmployee;
import com.capgemini.entity.Employee;
import com.capgemini.entity.RegularEmployee;
import com.capgemini.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/add")
	public String addAll() {
		Employee e1 = new Employee(101, "kapil");
		service.add(e1);
		
		ContractEmployee ce = new ContractEmployee(102,"krishna",10000, 12);
		service.add(ce);
		
		RegularEmployee re = new RegularEmployee(103,"abbas",3000.00, 1000);
		service.add(re);
		
		return "added successfully..";
	}	
	
	@RequestMapping("/get")
	public List<Employee> getAll() {
		return service.getAll();
	} 
}
