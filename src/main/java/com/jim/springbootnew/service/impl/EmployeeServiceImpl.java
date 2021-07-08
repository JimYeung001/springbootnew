package com.jim.springbootnew.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jim.springbootnew.model.Employee;
import com.jim.springbootnew.repo.EmployeeRepository;
import com.jim.springbootnew.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> findAllEmployees() {
		return getEmployeeRepo().findAll();
	}

	public EmployeeRepository getEmployeeRepo() {
		return this.employeeRepo;
	}

}
