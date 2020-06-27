package com.howtodoinjava.core.autowire.byName;

import lombok.Data;

@Data
public class Department
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
