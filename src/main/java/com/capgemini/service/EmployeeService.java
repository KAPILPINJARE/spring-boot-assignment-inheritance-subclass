package com.capgemini.service;

import java.util.List;

import com.capgemini.entity.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public List<Employee> getAll();
}
