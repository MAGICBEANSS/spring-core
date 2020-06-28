package com.howtodoinjava.core.autowire.byName;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee
{
	private String fullName;
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		System.out.println("Setting through property");
		this.department = department;
	}

	Employee(Department department) {
		System.out.println("Setting through constructor");
		this.department = department;
	}
}
