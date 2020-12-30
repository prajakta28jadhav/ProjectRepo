package com.cjc.app.fss.ro.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	private String productName;

	private String productType;

	private String productHsn;

	@Temporal(value = TemporalType.DATE)
	private Date productMafDate;

	@Temporal(value = TemporalType.DATE)
	private Date productExpDate;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "modelId")
	private Model model;

	private double productCostExcGst;

	private double productCostIncGst;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gstid")
	private GSTSlab gstSlab;	

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductHsn() {
		return productHsn;
	}

	public void setProductHsn(String productHsn) {
		this.productHsn = productHsn;
	}

	public Date getProductMafDate() {
		return productMafDate;
	}

	public void setProductMafDate(Date productMafDate) {
		this.productMafDate = productMafDate;
	}

	public Date getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(Date productExpDate) {
		this.productExpDate = productExpDate;
	}

	

	public double getProductCostExcGst() {
		return productCostExcGst;
	}

	public void setProductCostExcGst(double productCostExcGst) {
		this.productCostExcGst = productCostExcGst;
	}

	public double getProductCostIncGst() {
		return productCostIncGst;
	}

	public void setProductCostIncGst(double productCostIncGst) {
		this.productCostIncGst = productCostIncGst;
	}

	public GSTSlab getGstSlab() {
		return gstSlab;
	}

	public void setGstSlab(GSTSlab gstSlab) {
		this.gstSlab = gstSlab;
	}

}
