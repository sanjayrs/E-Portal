package com.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Manager.entity.Employee;
import com.Manager.service.EmployeeService;

@RestController
@RequestMapping("/api/employee/")
public class EmpController {
	@Autowired
	EmployeeService employeeService;
	@PutMapping("/{employeeId}")
	public Employee updateUser(@PathVariable("employeeId") Long employeeId, @RequestBody Employee empObject){
		System.out.println("employeeId"+employeeId);
		System.out.println("empObject"+empObject);
        return employeeService.updateUserById(empObject,employeeId);
    }
        @PostMapping("/add")
        public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.addEmp(employee);
        return ResponseEntity.ok(savedEmployee);
    }
	
	
}
