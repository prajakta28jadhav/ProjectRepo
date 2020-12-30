package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;

	private String statusName;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "status")
//	private Employee employee;
//
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "status")
//	private GSTSlab gstSlab;
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	public GSTSlab getGstSlab() {
//		return gstSlab;
//	}
//
//	public void setGstSlab(GSTSlab gstSlab) {
//		this.gstSlab = gstSlab;
//	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + "]";
	}

}
