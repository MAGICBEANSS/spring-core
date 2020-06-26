package com.howtodoinjava.core.autowire.byType;

import org.springframework.beans.factory.annotation.Autowired;
import com.howtodoinjava.core.autowire.byType.*;

public class EmployeeBean
{
	private String fullName;
	
	@Autowired
	private com.howtodoinjava.core.autowire.byType.DepartmentBean departmentBean;

	public com.howtodoinjava.core.autowire.byType.DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(com.howtodoinjava.core.autowire.byType.DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
