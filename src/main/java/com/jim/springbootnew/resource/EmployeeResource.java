package com.jim.springbootnew.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jim.springbootnew.model.Employee;
import com.jim.springbootnew.repo.EmployeeRepository;
import com.jim.springbootnew.service.EmployeeService;

@RestController
@RequestMapping(value ="/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return getEmployeeService().findAllEmployees();
	}
	
	
	public EmployeeService getEmployeeService() {
		return this.employeeService;
	}
	

}
