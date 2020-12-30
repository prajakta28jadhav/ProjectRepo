package com.cjc.app.fss.ro.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "vehicleDetails")
public class VehicleDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;

	@ManyToOne(cascade = CascadeType.ALL)
	// @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private CustomerDetails customerDetails;

	private String vehicleModel;
	private String vehicleVIN;
	private String vehicleColor;

	private String vehicleDealer;
	private String vehicleRegistrationNumber;
	private int vehicleKiloMeter;
	private String vehicleFuelType;
	private String vehicleEngineNumber;
	private String vehicleInsuranceCompanyName;
	private int vehicleInsuranceCode;
	private Date vehicleInsuranceExpiryDate;
	private String vehicleInsurancePolicyNumber;

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public String getVehicleVIN() {
		return vehicleVIN;
	}

	public void setVehicleVIN(String vehicleVIN) {
		this.vehicleVIN = vehicleVIN;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleDealer() {
		return vehicleDealer;
	}

	public void setVehicleDealer(String vehicleDealer) {
		this.vehicleDealer = vehicleDealer;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public int getVehicleKiloMeter() {
		return vehicleKiloMeter;
	}

	public void setVehicleKiloMeter(int vehicleKiloMeter) {
		this.vehicleKiloMeter = vehicleKiloMeter;
	}

	public String getVehicleFuelType() {
		return vehicleFuelType;
	}

	public void setVehicleFuelType(String vehicleFuelType) {
		this.vehicleFuelType = vehicleFuelType;
	}

	public String getVehicleEngineNumber() {
		return vehicleEngineNumber;
	}

	public void setVehicleEngineNumber(String vehicleEngineNumber) {
		this.vehicleEngineNumber = vehicleEngineNumber;
	}

	public String getVehicleInsuranceCompanyName() {
		return vehicleInsuranceCompanyName;
	}

	public void setVehicleInsuranceCompanyName(String vehicleInsuranceCompanyName) {
		this.vehicleInsuranceCompanyName = vehicleInsuranceCompanyName;
	}

	public int getVehicleInsuranceCode() {
		return vehicleInsuranceCode;
	}

	public void setVehicleInsuranceCode(int vehicleInsuranceCode) {
		this.vehicleInsuranceCode = vehicleInsuranceCode;
	}

	public Date getVehicleInsuranceExpiryDate() {
		return vehicleInsuranceExpiryDate;
	}

	public void setVehicleInsuranceExpiryDate(Date vehicleInsuranceExpiryDate) {
		this.vehicleInsuranceExpiryDate = vehicleInsuranceExpiryDate;
	}

	public String getVehicleInsurancePolicyNumber() {
		return vehicleInsurancePolicyNumber;
	}

	public void setVehicleInsurancePolicyNumber(String vehicleInsurancePolicyNumber) {
		this.vehicleInsurancePolicyNumber = vehicleInsurancePolicyNumber;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	@Override
	public String toString() {
		return "VehicleDetails [vehicleId=" + vehicleId + ", customerDetails=" + customerDetails + ", vehicleModel="
				+ vehicleModel + ", vehicleVIN=" + vehicleVIN + ", vehicleColor=" + vehicleColor + ", vehicleDealer="
				+ vehicleDealer + ", vehicleRegistrationNumber=" + vehicleRegistrationNumber + ", vehicleKiloMeter="
				+ vehicleKiloMeter + ", vehicleFuelType=" + vehicleFuelType + ", vehicleEngineNumber="
				+ vehicleEngineNumber + ", vehicleInsuranceCompanyName=" + vehicleInsuranceCompanyName
				+ ", vehicleInsuranceCode=" + vehicleInsuranceCode + ", vehicleInsuranceExpiryDate="
				+ vehicleInsuranceExpiryDate + ", vehicleInsurancePolicyNumber=" + vehicleInsurancePolicyNumber + "]";
	}

}
