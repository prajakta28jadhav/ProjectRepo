package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RO_LabourDetails")
public class ROLabourChargesDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roLabourId;

	private String description;

	private double labourChargesExcludingGST;

	private double labourChargesIncludingGST;

	public int getRoLabourId() {
		return roLabourId;
	}

	public void setRoLabourId(int roLabourId) {
		this.roLabourId = roLabourId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLabourChargesExcludingGST() {
		return labourChargesExcludingGST;
	}

	public void setLabourChargesExcludingGST(double labourChargesExcludingGST) {
		this.labourChargesExcludingGST = labourChargesExcludingGST;
	}

	public double getLabourChargesIncludingGST() {
		return labourChargesIncludingGST;
	}

	public void setLabourChargesIncludingGST(double labourChargesIncludingGST) {
		this.labourChargesIncludingGST = labourChargesIncludingGST;
	}

	@Override
	public String toString() {
		return "ROLabourChargesDetails [roLabourId=" + roLabourId + ", description=" + description
				+ ", labourChargesExcludingGST=" + labourChargesExcludingGST + ", labourChargesIncludingGST="
				+ labourChargesIncludingGST + "]";
	}

	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ro_service_id")
//	private ROService roService;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "roLabourChargesDetails")
//	private InvoiceTable invoiceTable;

//	public Employee getEmployee() {
//		return employee;
//	}

//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

}
