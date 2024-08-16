package com.avsoft.customermanagment.controller;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avsoft.customermanagment.entity.Employee;
import com.avsoft.customermanagment.services.EmployeeService;
import com.avsoft.customermanagment.services.EmployeeServiceImpl;
import com.avsoft.customermanagment.services.PermentEmployeeServiceImpl2;

@RestController
@RequestMapping("/employeeService")
public class EmployeeControllers {




  
  
	@Autowired
	@Qualifier("employeeServiceImpl")
	private EmployeeService e;


	@PostMapping("/employee")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		
		 e.addEmployee(employee);
		
		e.addEmployee(employee);
		
		/*
		 * employeeService1 =(EmployeeService)
		 * applicationContext.getBean("employeeServiceImpl"); employeeService2
		 * =(EmployeeService) applicationContext.getBean("employeeServiceImpl");
		 * 
		 * System.out.println(employeeService1.hashCode());
		 * System.out.println(employeeService2.hashCode());
		 */
		
		//employeeService1.addEmployee(employee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity getEmployee(@PathVariable("id") int id) {
		Employee employee = employeeService.getEmployee(id);

		return new ResponseEntity(employee, HttpStatus.OK);
		
	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity deleteEMplyee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity(HttpStatus.OK);

	}

	@GetMapping("/employees")
	public ResponseEntity getAllEmployee() {

		List<Employee> employees = employeeService.getAllEmployee();

		return new ResponseEntity(employees, HttpStatus.OK);

	}

}
