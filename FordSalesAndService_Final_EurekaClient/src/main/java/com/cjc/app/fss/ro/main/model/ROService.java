package com.cjc.app.fss.ro.main.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ROService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ro_service_id")
	private int roServiceId;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<ServiceType> serviceType = new HashSet<>();

	@Column(name = "service_repair_quantity")
	private int serviceRepairQuantity;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "arrivalDate")
	private Date arrivalDate;

//	@Temporal(value = TemporalType.TIME)
//	@Column(name = "arrivalTime")
//	private Date arrivalTime;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "promisedDate")
	private Date promisedDate;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "extendedDate")
	private Date extendedDate;

//	@Temporal(value = TemporalType.TIME)
//	@Column(name = "promisedTime")
//	private Date promisedTime;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "customer_id")
//	private CustomerDetails customer;

	private int customerId;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "roService")
//	private ROLabourChargesDetails roLabourChargesDetails;
//
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "roService")
//	private Set<ROPartDetails> roPartDetails;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "mechanic_id")
//	private Employee employeeAsMechanic;

	private int employeeAsMechanic;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ro_created_by_employee_id")
//	private Employee employeeAsExecutive;

	private int employeeAsExecutive;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "vehicle_id")
//	private VehicleDetails vehicle;

	private int vehicleId;

	@Column(name = "current_km")
	private int currentKM;

	@Column(name = "service_category")
	private String serviceCategory;

	@OneToOne
	private Status status;
	
	

//	private int statusId;
	

	@Temporal(value = TemporalType.DATE)
	@Column(name = "ro_created_date")
	private Date roCreatedDate;

	private String roNumber;

	
	
	

	public Date getExtendedDate() {
		return extendedDate;
	}

	public void setExtendedDate(Date extendedDate) {
		this.extendedDate = extendedDate;
	}

	public String getRoNumber() {
		return roNumber;
	}

	public void setRoNumber(String roNumber) {
		this.roNumber = roNumber;
	}

	public int getRoServiceId() {
		return roServiceId;
	}

	public void setRoServiceId(int roServiceId) {
		this.roServiceId = roServiceId;
	}

	public int getServiceRepairQuantity() {
		return serviceRepairQuantity;
	}

	public void setServiceRepairQuantity(int serviceRepairQuantity) {
		this.serviceRepairQuantity = serviceRepairQuantity;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

//	public Date getArrivalTime() {
//		return arrivalTime;
//	}
//
//	public void setArrivalTime(Date arrivalTime) {
//		this.arrivalTime = arrivalTime;
//	}

	public Date getPromisedDate() {
		return promisedDate;
	}

	public void setPromisedDate(Date promisedDate) {
		this.promisedDate = promisedDate;
	}

//	public Date getPromisedTime() {
//		return promisedTime;
//	}
//
//	public void setPromisedTime(Date promisedTime) {
//		this.promisedTime = promisedTime;
//	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

//	public ROLabourChargesDetails getRoLabourChargesDetails() {
//		return roLabourChargesDetails;
//	}
//
//	public void setRoLabourChargesDetails(ROLabourChargesDetails roLabourChargesDetails) {
//		this.roLabourChargesDetails = roLabourChargesDetails;
//	}
//
//	public Set<ROPartDetails> getRoPartDetails() {
//		return roPartDetails;
//	}
//
//	public void setRoPartDetails(Set<ROPartDetails> roPartDetails) {
//		this.roPartDetails = roPartDetails;
//	}

	public int getEmployeeAsMechanic() {
		return employeeAsMechanic;
	}

	public void setEmployeeAsMechanic(int employeeAsMechanic) {
		this.employeeAsMechanic = employeeAsMechanic;
	}

	public int getEmployeeAsExecutive() {
		return employeeAsExecutive;
	}

	public void setEmployeeAsExecutive(int employeeAsExecutive) {
		this.employeeAsExecutive = employeeAsExecutive;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Set<ServiceType> getServiceType() {
		return serviceType;
	}

	public void setServiceType(Set<ServiceType> serviceType) {
		this.serviceType = serviceType;
	}

	public int getCurrentKM() {
		return currentKM;
	}

	public void setCurrentKM(int currentKM) {
		this.currentKM = currentKM;
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getRoCreatedDate() {
		return roCreatedDate;
	}

	public void setRoCreatedDate(Date roCreatedDate) {
		this.roCreatedDate = roCreatedDate;
	}

	@Override
	public String toString() {
		return "ROService [roServiceId=" + roServiceId + ", serviceType=" + serviceType + ", serviceRepairQuantity="
				+ serviceRepairQuantity + ", arrivalDate=" + arrivalDate + ", promisedDate=" + promisedDate
				+ ", customerId=" + customerId + ", employeeAsMechanic=" + employeeAsMechanic + ", employeeAsExecutive="
				+ employeeAsExecutive + ", vehicleId=" + vehicleId + ", currentKM=" + currentKM + ", serviceCategory="
				+ serviceCategory + ", status=" + status + ", roCreatedDate=" + roCreatedDate + ", roNumber=" + roNumber
				+ "]";
	}

}
