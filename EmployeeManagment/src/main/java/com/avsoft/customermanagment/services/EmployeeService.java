package com.avsoft.customermanagment.services;

import java.util.List;

import com.avsoft.customermanagment.entity.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
	public void deleteEmployee(int id);
	
}
