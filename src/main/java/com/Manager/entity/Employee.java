package com.Manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "emp_id")
	    private Long empId;

	    @Column(name = "emp_name")
	    private String empName;

	    @Column(name = "emp_email")
	    private String empEmail;

	    @Column(name = "emp_password")
	    private String empPassword;

	    @Column(name = "emp_phone")
	    private Double empPhone;

		public Long getEmpId() {
			return empId;
		}

		public void setEmpId(Long empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpEmail() {
			return empEmail;
		}

		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}

		public String getEmpPassword() {
			return empPassword;
		}

		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
		}

		public Double getEmpPhone() {
			return empPhone;
		}

		public void setEmpPhone(Double empPhone) {
			this.empPhone = empPhone;
		}
	    
	}
