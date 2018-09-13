package com.prabhat.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	@JsonProperty("EmployeeId")
	private int employeeId;
	
	@JsonProperty("EmployeeName")
	private String employeeName;
	
	@JsonProperty("EmplyeeDepartment")
	private String emplyeeDepartment;
	
	@JsonProperty("ServerPort")
	private String serverPort;

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmplyeeDepartment() {
		return emplyeeDepartment;
	}

	public void setEmplyeeDepartment(String emplyeeDepartment) {
		this.emplyeeDepartment = emplyeeDepartment;
	}

}
