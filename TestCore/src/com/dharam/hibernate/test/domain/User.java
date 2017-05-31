package com.dharam.hibernate.test.domain;

import java.util.Date;
import java.util.Set;

public class User {

	private Long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private Date DOB;
	private Date DOJ;
	private Set<Role> roles;
	
	public User() {
		
	}
	
	public User(Long id, String firstName, String lastName, String emailId, Date dOB) {
		super();
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		DOB = dOB;
	}
	
	
	
	public Long getUserId() {
		return userId;
	}



	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(userId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", DOB=");
		builder.append(DOB);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
