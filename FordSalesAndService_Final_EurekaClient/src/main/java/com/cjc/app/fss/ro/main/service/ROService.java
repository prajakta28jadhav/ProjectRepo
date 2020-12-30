package com.cjc.app.fss.ro.main.service;

import java.util.List;
import java.util.Map;

import com.cjc.app.fss.ro.main.model.DailyStockDetails;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ROLabourChargesDetails;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.Status;
import com.cjc.app.fss.ro.main.model.VehicleDetails;

public interface ROService {

	VehicleDetails getVehicleDetails(String vin);

	void save(VehicleDetails vehicle);

	VehicleDetails getVehicleDetailsByRegNo(String registrationNo);

	List<VehicleDetails> getCustomerByMobileNo(long mobileNo);

	List<ServiceType> getServicingType();

	void saveProduct(Product product);

	List<Product> getAllProducts();

	DailyStockDetails getStockByProductId(int prodId);

	void saveInvoiceData(InvoiceTable invoice);

	VehicleDetails getDataByVehicleId(int id);

	String getProductNameById(int id);

	List<Map<Object, Object>> getDataForOpenService();

	void saveLabourChargesDetails(List<ROLabourChargesDetails> labourChargesDetails);

	List<ROLabourChargesDetails> getLabourCharges();

	String getLabourNameById(int id);

	void updatePreInvoiceEntryAsPaid(String invoiceNo, InvoiceTable invoice);

	Status getStatusId(String statusName);

	List<Map<Object, Object>> getDataForClosedService();

	void updateStatus(String invoiceNo, int status, int reopenFlag, InvoiceTable invoice);

}
