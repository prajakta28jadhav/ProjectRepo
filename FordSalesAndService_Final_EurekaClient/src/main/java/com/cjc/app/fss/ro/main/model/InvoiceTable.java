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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class InvoiceTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Invoice_id")
	private int invoiceId;

	@Column(name = "invoice_no")
	private String invoiceNo;

	@OneToOne(cascade = CascadeType.ALL)
	private ROService roService;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<ROPartDetails> roPartDetails = new HashSet<ROPartDetails>();

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE })
	private Set<ROLabourChargesDetails> roLabourChargesDetails = new HashSet<>();

	@Temporal(value = TemporalType.DATE)
	@Column(name = "pre_invoice_gen_date")
	private Date preInvoiceGenDate;

	@Column(name = "total_pre_invoice_price")
	private double totalPreInvoicePrice;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "invoice_gen_date")
	private Date invoiceGenDate;

	@Column(name = "total_paid_amt")
	private double totalPaidAmt;

	@Column(name = "gate_pass_gen_status")
	private String gatePassGenStatus;

	private String paymentStatus;

	private int reopenFlag;

	public int getReopenFlag() {
		return reopenFlag;
	}

	public void setReopenFlag(int reopenFlag) {
		this.reopenFlag = reopenFlag;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Set<ROPartDetails> getRoPartDetails() {
		return roPartDetails;
	}

	public ROService getRoService() {
		return roService;
	}

	public void setRoService(ROService roService) {
		this.roService = roService;
	}

	public Set<ROLabourChargesDetails> getRoLabourChargesDetails() {
		return roLabourChargesDetails;
	}

	public void setRoLabourChargesDetails(Set<ROLabourChargesDetails> roLabourChargesDetails) {
		this.roLabourChargesDetails = roLabourChargesDetails;
	}

	public void setRoPartDetails(Set<ROPartDetails> roPartDetails) {
		this.roPartDetails = roPartDetails;
	}

	public Date getPreInvoiceGenDate() {
		return preInvoiceGenDate;
	}

	public void setPreInvoiceGenDate(Date preInvoiceGenDate) {
		this.preInvoiceGenDate = preInvoiceGenDate;
	}

	public double getTotalPreInvoicePrice() {
		return totalPreInvoicePrice;
	}

	public void setTotalPreInvoicePrice(double totalPreInvoicePrice) {
		this.totalPreInvoicePrice = totalPreInvoicePrice;
	}

	public Date getInvoiceGenDate() {
		return invoiceGenDate;
	}

	public void setInvoiceGenDate(Date invoiceGenDate) {
		this.invoiceGenDate = invoiceGenDate;
	}

	public double getTotalPaidAmt() {
		return totalPaidAmt;
	}

	public void setTotalPaidAmt(double totalPaidAmt) {
		this.totalPaidAmt = totalPaidAmt;
	}

	public String getGatePassGenStatus() {
		return gatePassGenStatus;
	}

	public void setGatePassGenStatus(String gatePassGenStatus) {
		this.gatePassGenStatus = gatePassGenStatus;
	}

	@Override
	public String toString() {
		return "InvoiceTable [invoiceId=" + invoiceId + ", invoiceNo=" + invoiceNo + ", roService=" + roService
				+ ", roPartDetails=" + roPartDetails + ", roLabourChargesDetails=" + roLabourChargesDetails
				+ ", preInvoiceGenDate=" + preInvoiceGenDate + ", totalPreInvoicePrice=" + totalPreInvoicePrice
				+ ", invoiceGenDate=" + invoiceGenDate + ", totalPaidAmt=" + totalPaidAmt + ", gatePassGenStatus="
				+ gatePassGenStatus + "]";
	}

}
