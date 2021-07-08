package com.jim.springbootnew.controller;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.jim.springbootnew.model.Employee;
import com.jim.springbootnew.resource.EmployeeResource;
import com.jim.springbootnew.service.EmployeeService;

@SpringBootTest
public class EmployeeResourceMockitoTest {
	
	@Mock
	private EmployeeService employeeService;
	
	@InjectMocks
	private EmployeeResource employeeResource;
	
	@BeforeEach
	void setMockOutput() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		employees.add(new Employee());
		employees.add(new Employee());
		employees.add(new Employee());
		
		when(employeeService.findAllEmployees()).thenReturn(employees);
	}
	
	
	@Test
	public void shouldReturnListPerson() {
		List<Employee> allPeople = employeeResource.getAllEmployees();
		assertThat(allPeople).asList();
	}
	

}
