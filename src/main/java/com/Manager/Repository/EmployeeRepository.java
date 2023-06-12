package com.Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Manager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
