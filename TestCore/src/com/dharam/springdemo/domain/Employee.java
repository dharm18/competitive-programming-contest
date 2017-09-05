package com.dharam.springdemo.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String firstName;
	private String lastName;
	private Date doj;
	List addressList;
	Set  addressSet;
	Map  addressMap;
	Properties addressProp;
	
	
	public List getAddressList() {
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("seettter");
		this.lastName = lastName;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", doj=");
		builder.append(doj);
		builder.append("]");
		return builder.toString();
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
	
}
