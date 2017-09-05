package com.test.bean;

public class Employee {

	private String name;
	private Department department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", department=");
		builder.append(department);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
