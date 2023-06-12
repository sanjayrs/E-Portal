package com.Manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Manager.Repository.EmployeeRepository;
import com.Manager.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeerepository;

	
	
}
