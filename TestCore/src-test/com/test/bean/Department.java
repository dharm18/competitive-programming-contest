package com.test.bean;

public class Department {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
}
