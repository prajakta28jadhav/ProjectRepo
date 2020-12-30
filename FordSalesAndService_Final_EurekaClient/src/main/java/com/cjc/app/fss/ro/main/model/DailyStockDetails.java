package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DailyStockDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dailyStockId;

	@OneToOne(cascade = CascadeType.ALL)
	private Product product;

	private String productDescription;
	private String receivedStockData;
	private int stockIn;
	private int stockOut;
	private int productQuantity;
	private double productCost;

	public int getDailyStockId() {
		return dailyStockId;
	}

	public void setDailyStockId(int dailyStockId) {
		this.dailyStockId = dailyStockId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getDailStockId() {
		return dailyStockId;
	}

	public void setDailStockId(int dailStockId) {
		this.dailyStockId = dailStockId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getReceivedStockData() {
		return receivedStockData;
	}

	public void setReceivedStockData(String receivedStockData) {
		this.receivedStockData = receivedStockData;
	}

	public int getStockIn() {
		return stockIn;
	}

	public void setStockIn(int stockIn) {
		this.stockIn = stockIn;
	}

	public int getStockOut() {
		return stockOut;
	}

	public void setStockOut(int stockOut) {
		this.stockOut = stockOut;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "DailyStockDetails [dailyStockId=" + dailyStockId + ", product=" + product + ", productDescription="
				+ productDescription + ", receivedStockData=" + receivedStockData + ", stockIn=" + stockIn
				+ ", stockOut=" + stockOut + ", productQuantity=" + productQuantity + ", productCost=" + productCost
				+ "]";
	}

}
