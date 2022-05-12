
package com.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="details about department")
public class Department {
	@ApiModelProperty(notes="the department name should be string")
	private String departmentName;
	@ApiModelProperty(notes="the manager name should be string")
	private String managerName;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Department(String departmentName, String managerName) {
		super();
		this.departmentName = departmentName;
		this.managerName = managerName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", managerName=" + managerName + "]";
	}
	
	
}
