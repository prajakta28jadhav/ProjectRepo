package com.cjc.app.fss.ro.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	private String customerFirstName;
	private String customerLastName;
	private String customerAddress;
	private String customerState;
	private int customerPincode;
	private long customerMobileNumber;
	private String customerEmailId;
	private String customerPanCardNumber;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerDetails")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Set<VehicleDetails> vehicleDetails = new HashSet<VehicleDetails>();

	public Set<VehicleDetails> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(Set<VehicleDetails> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(int customerPincode) {
		this.customerPincode = customerPincode;
	}

	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerPanCardNumber() {
		return customerPanCardNumber;
	}

	public void setCustomerPanCardNumber(String customerPanCardNumber) {
		this.customerPanCardNumber = customerPanCardNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
}
