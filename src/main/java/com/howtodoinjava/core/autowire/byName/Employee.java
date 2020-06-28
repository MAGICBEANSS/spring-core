package com.howtodoinjava.core.autowire.byName;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
public class Employee
{
	private String fullName;
	private Department department;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Employee(Department department) {
		this.department = department;
	}
}
