package com.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Manager.entity.Employee;
import com.Manager.service.EmployeeService;

@RestController
public class EmpController {
	@Autowired
	EmployeeService employeeService;
	@PutMapping("/api/employee/{employeeId}")
	public Employee updateUser(@PathVariable("employeeId") Long employeeId, @RequestBody Employee empObject){
		System.out.println("employeeId"+employeeId);
		System.out.println("empObject"+empObject);
        return employeeService.updateUserById(empObject,employeeId);
    }
	
	
}
