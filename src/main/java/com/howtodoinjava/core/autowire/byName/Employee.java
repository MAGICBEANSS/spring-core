package com.howtodoinjava.core.autowire.byName;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class Employee
{
	private String firstName;
	private String fullName;
	private static String lastName;
	private static String  midName;

	public static void setMidName(String midName) {
		Employee.midName = midName;
	}

	{
		this.firstName  = "instanceblockfname";
		this.midName  = "instanceblockmidname";
	}

	private Department department;
	static
	{
		midName = "some midname";
			lastName = "Some lastname";
	}

	public Employee(String firstName) {

		this.firstName = firstName;
		this.midName = "COnstructorMidname";
	}

	public Employee(Integer o) {

		this.firstName = "1args ";
		this.midName = "1args";
	}

	public Employee() {

		this.firstName = "0args ";
		this.midName = "0args";
	}


	@Override
	public String toString() {
		return "Employee{" +
				"firstName='" + firstName + '\'' +
				", fullName='" + fullName + '\'' +
				", lastName='" + lastName + '\'' +
				", midName='" + midName + '\'' +

				", department=" + department +
				'}';
	}
}
