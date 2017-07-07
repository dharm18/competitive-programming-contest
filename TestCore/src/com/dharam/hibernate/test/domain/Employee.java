package com.dharam.hibernate.test.domain;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private Set certificates;
	private Address address;

	public Employee(String firstName, String lastName, int salary, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Employee() {
	}

	

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, int salary, Set certificates) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.certificates = certificates;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Set getCertificates() {
		return certificates;
	}

	public void setCertificates(Set certificates) {
		this.certificates = certificates;
	}
}