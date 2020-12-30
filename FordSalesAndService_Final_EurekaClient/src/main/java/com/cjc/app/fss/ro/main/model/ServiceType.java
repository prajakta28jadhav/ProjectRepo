package com.cjc.app.fss.ro.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;

	private String serviceName;

	private double serviceCostExcGst;

	private double serviceCostIncGst;

	private String serviceDescription;
	
	
	private boolean isFree;
	
	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getServiceCostExcGst() {
		return serviceCostExcGst;
	}

	public void setServiceCostExcGst(double serviceCostExcGst) {
		this.serviceCostExcGst = serviceCostExcGst;
	}

	public double getServiceCostIncGst() {
		return serviceCostIncGst;
	}

	public void setServiceCostIncGst(double serviceCostIncGst) {
		this.serviceCostIncGst = serviceCostIncGst;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

}
