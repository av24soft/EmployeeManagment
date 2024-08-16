package com.avsoft.customermanagment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.avsoft.customermanagment.entity.Employee;
import com.avsoft.customermanagment.repository.EmployeeRepo;

@Service
@Scope
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired	
	private EmployeeRepo employeeRepo;

	@Override
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		
	Optional<Employee> optional = 	employeeRepo.findById(id);
		return optional.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepo.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}

	
	
	
	
	
	
	
}
