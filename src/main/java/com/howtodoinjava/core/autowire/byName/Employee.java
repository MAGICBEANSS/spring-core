package com.howtodoinjava.core.autowire.byName;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
public class Employee
{
	private String fullName;
	private Department department;

}
