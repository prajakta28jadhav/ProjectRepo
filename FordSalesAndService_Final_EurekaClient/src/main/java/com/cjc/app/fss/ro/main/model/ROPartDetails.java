package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ROPartDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parts_id")
	private int partId;

	private int productId;

	@Column(name = "quantity")
	private int quantity;

	private double rate;

	private double totalPrice;

	@Column(name = "product_price_excludingGST")
	private double productPriceExcludingGST;

	@Column(name = "product_price_includingGST")
	private double productPriceIncludingGST;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "product_id")
//	private Product product;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ro_service_id")
//	private ROService roService;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "invoice_id")
//	private InvoiceTable invoiceTable;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getProductPriceExcludingGST() {
		return productPriceExcludingGST;
	}

	public void setProductPriceExcludingGST(double productPriceExcludingGST) {
		this.productPriceExcludingGST = productPriceExcludingGST;
	}

	public double getProductPriceIncludingGST() {
		return productPriceIncludingGST;
	}

	public void setProductPriceIncludingGST(double productPriceIncludingGST) {
		this.productPriceIncludingGST = productPriceIncludingGST;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

//	public ROService getRoService() {
//		return roService;
//	}
//
//	public void setRoService(ROService roService) {
//		this.roService = roService;
//	}

	@Override
	public String toString() {
		return "ROPartDetails [partId=" + partId + ", quantity=" + quantity + ", productPriceExcludingGST="
				+ productPriceExcludingGST + ", productPriceIncludingGST=" + productPriceIncludingGST + ", totalPrice="
				+ totalPrice + ", productId=" + productId + "]";
	}

}
