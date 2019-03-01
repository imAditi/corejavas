package com.yash.java;

public class Employee {

	private String firstName;
	private String lastName;
	private String company;
	private String role;
	
public String generatePassword() {
	String result = firstName.substring(0,2) + lastName.substring(0,2) + company.substring(0,2) + role.substring(0,2);
	return result;
}


public String getfirstName() {
	return firstName;
}
public void setfirstName(String firstName) {
	this.firstName = firstName;
}
public String getlastName() {
	return lastName;
}
public void setlastName(String lastName) {
	this.lastName = lastName;
}
public String getcompany() {
	return company;
}
public void setcompany(String company) {
	this.company = company;
}
public String getrole() {
	return role;
}
public void setrole(String role) {
	this.role = role;
}
}