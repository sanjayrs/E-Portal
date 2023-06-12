package com.Manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Manager.Repository.EmployeeRepository;
import com.Manager.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeerepository;

	public Employee updateUserById(Employee empObject, Long employeeId) {
		Employee existingUser = employeerepository.findById(employeeId).get();
		existingUser.setEmpName(empObject.getEmpName());
		existingUser.setEmpEmail(empObject.getEmpEmail());
		existingUser.setEmpPassword(empObject.getEmpPassword());
		existingUser.setEmpPhone(empObject.getEmpPhone());

		employeerepository.save(existingUser);
		return employeerepository.findById(employeeId).get();
	}
	
	
}
