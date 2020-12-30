package com.cjc.app.fss.ro.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employeeDetails")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;

	private String employeeName;

	private String employeeUname;

	private String employeePass;

	private String employeeFirstname;

	private String employeeLastname;

	private long employeeMobile;

	@Temporal(value = TemporalType.DATE)
	private Date employeeDob;

	private String employeeQualification;

	private String employeeGender;

	private String employeePermenantAddress;

	private String employeeLocalAddress;

	private String employeeEmail;

	@Temporal(value = TemporalType.DATE)
	private Date employeeJoinDates;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeStatusId")
	private Status status;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeRoleId")
	private UserRole role;

	public String getEmployeeQualification() {
		return employeeQualification;
	}

	public void setEmployeeQualification(String employeeQualification) {
		this.employeeQualification = employeeQualification;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public Status getEmpStatus() {
		return status;
	}

	public void setEmpStatus(Status empStatus) {
		this.status = empStatus;
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

	public String getEmployeeUname() {
		return employeeUname;
	}

	public void setEmployeeUname(String employeeUname) {
		this.employeeUname = employeeUname;
	}

	public String getEmployeePass() {
		return employeePass;
	}

	public void setEmployeePass(String employeePass) {
		this.employeePass = employeePass;
	}

	public String getEmployeeFirstname() {
		return employeeFirstname;
	}

	public void setEmployeeFirstname(String employeeFirstname) {
		this.employeeFirstname = employeeFirstname;
	}

	public String getEmployeeLastname() {
		return employeeLastname;
	}

	public void setEmployeeLastname(String employeeLastname) {
		this.employeeLastname = employeeLastname;
	}

	public long getEmployeeMobile() {
		return employeeMobile;
	}

	public String getEmployeePermenantAddress() {
		return employeePermenantAddress;
	}

	public void setEmployeePermenantAddress(String employeePermenantAddress) {
		this.employeePermenantAddress = employeePermenantAddress;
	}

	public String getEmployeeLocalAddress() {
		return employeeLocalAddress;
	}

	public void setEmployeeLocalAddress(String employeeLocalAddress) {
		this.employeeLocalAddress = employeeLocalAddress;
	}

	public void setEmployeeMobile(long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public Date getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeQulification() {
		return employeeQualification;
	}

	public void setEmployeeQulification(String employeeQualification) {
		this.employeeQualification = employeeQualification;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Date getEmployeeJoinDates() {
		return employeeJoinDates;
	}

	public void setEmployeeJoinDates(Date employeeJoinDates) {
		this.employeeJoinDates = employeeJoinDates;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeUname="
				+ employeeUname + ", employeePass=" + employeePass + ", employeeFirstname=" + employeeFirstname
				+ ", employeeLastname=" + employeeLastname + ", employeeMobile=" + employeeMobile + ", employeeDob="
				+ employeeDob + ", employeeQualification=" + employeeQualification + ", employeeGender="
				+ employeeGender + ", employeePermenantAddress=" + employeePermenantAddress + ", employeeLocalAddress="
				+ employeeLocalAddress + ", employeeEmail=" + employeeEmail + ", employeeJoinDates=" + employeeJoinDates
				+ ", status=" + status + ", role=" + role + "]";
	}
}
