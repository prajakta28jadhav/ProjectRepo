package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int modelId;

	private String modelName;
	private String modelType;
	private String modelFuelType;
	private String modelEngineType;
	private int modelSeats;
	private String modelColor;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "makeId")
	private Make make;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "model")
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getModelFuelType() {
		return modelFuelType;
	}

	public void setModelFuelType(String modelFuelType) {
		this.modelFuelType = modelFuelType;
	}

	public String getModelEngineType() {
		return modelEngineType;
	}

	public void setModelEngineType(String modelEngineType) {
		this.modelEngineType = modelEngineType;
	}

	public int getModelSeats() {
		return modelSeats;
	}

	public void setModelSeats(int modelSeats) {
		this.modelSeats = modelSeats;
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = make;
	}

	public String getModelColor() {
		return modelColor;
	}

	public void setModelColor(String modelColor) {
		this.modelColor = modelColor;
	}

}
