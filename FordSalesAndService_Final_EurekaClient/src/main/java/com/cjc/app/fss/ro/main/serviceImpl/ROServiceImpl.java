package com.cjc.app.fss.ro.main.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.DailyStockDetails;
import com.cjc.app.fss.ro.main.model.Employee;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ROLabourChargesDetails;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.Status;
import com.cjc.app.fss.ro.main.model.VehicleDetails;
import com.cjc.app.fss.ro.main.repository.CustomerRepository;
import com.cjc.app.fss.ro.main.repository.EmployeeRepository;
import com.cjc.app.fss.ro.main.repository.InvoiceRepository;
import com.cjc.app.fss.ro.main.repository.ProductRepository;
import com.cjc.app.fss.ro.main.repository.ROLabourChargesDetailsRepository;
import com.cjc.app.fss.ro.main.repository.ServiceTypeRepository;
import com.cjc.app.fss.ro.main.repository.StatusRepository;
import com.cjc.app.fss.ro.main.repository.StockRepository;
import com.cjc.app.fss.ro.main.repository.VehicleRepository;
import com.cjc.app.fss.ro.main.service.ROService;

@Service
public class ROServiceImpl implements ROService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ServiceTypeRepository serviceTypeRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	StockRepository stockRepository;

	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ROLabourChargesDetailsRepository labourChargesRepository;
	
	@Autowired
	StatusRepository statusRepository;

	@Override
	public VehicleDetails getVehicleDetails(String vin) {

		return vehicleRepository.findByVehicleVIN(vin);
	}

	@Override
	public void save(VehicleDetails vehicle) {
		vehicleRepository.save(vehicle);
	}

	@Override
	public VehicleDetails getVehicleDetailsByRegNo(String registrationNo) {
		return vehicleRepository.findByVehicleRegistrationNumber(registrationNo);
	}

	@Override
	public List<VehicleDetails> getCustomerByMobileNo(long mobileNo) {
		List<VehicleDetails> list = null;
		CustomerDetails customer = customerRepository.findByCustomerMobileNumber(mobileNo);
		if (customer != null) {
			list = vehicleRepository.findByCustomerDetails_CustomerId(customer.getCustomerId());
		}
		return list;
	}

	@Override
	public List<ServiceType> getServicingType() {
		return (List<ServiceType>) serviceTypeRepository.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public DailyStockDetails getStockByProductId(int prodId) {
		DailyStockDetails st = stockRepository.findByProduct_ProductId(prodId);
		return st;
	}

	@Override
	public void saveInvoiceData(InvoiceTable invoice) {
		System.out.println("aaaaaaaaaaaaa   ");
		invoiceRepository.save(invoice);
	}

	@Override
	public VehicleDetails getDataByVehicleId(int id) {
		VehicleDetails vehicle = vehicleRepository.findByVehicleId(id);
		return vehicle;
	}

	@Override
	public String getProductNameById(int id) {
		Product product = productRepository.findByProductId(id);
		System.out.println("00000000000000     " + product.getProductName());
		return product.getProductName();
	}

	@Override
	public List<Map<Object, Object>> getDataForOpenService() {
		List<Map<Object, Object>> objList = new ArrayList<>();
		
		
		List<InvoiceTable> list = invoiceRepository.getDataForOpenService();
		
		objList = getData(list);
	
		return objList;
	}

	private List<Map<Object, Object>> getData(List<InvoiceTable> list) {
		
		List<Map<Object, Object>> objList = new ArrayList<>();
		Map<Object, Object> map = null;
		for (InvoiceTable invoice : list) {
			//System.out.println(i + "  \n\n " + invoice);

			map = new HashMap<>();
			
			int invoiceId = invoice.getInvoiceId();
			String invoiceNumber = invoice.getInvoiceNo();
			Date invoiceDate = invoice.getPreInvoiceGenDate();
			String roNumber = invoice.getRoService().getRoNumber();
			String ServicingStatus = invoice.getRoService().getServiceCategory();
			Date arrivalDate = invoice.getRoService().getArrivalDate();
			Date promisedDate = invoice.getRoService().getPromisedDate();
			String paymentStatus = invoice.getPaymentStatus();
			Date roCreatedDate = invoice.getRoService().getRoCreatedDate();
			String status = invoice.getRoService().getStatus().getStatusName();
			Date extendedDate = invoice.getRoService().getExtendedDate();
			int reopenFlag = invoice.getReopenFlag();
			int roserviceId = invoice.getRoService().getRoServiceId();

			CustomerDetails customer = customerRepository.findByCustomerId(invoice.getRoService().getCustomerId());
			String custFirstName = customer.getCustomerFirstName();
			String custLastName = customer.getCustomerLastName();
			String custAddress = customer.getCustomerAddress();
			long custMobNo = customer.getCustomerMobileNumber();
			int custId = customer.getCustomerId();

			VehicleDetails vehicle = vehicleRepository.findByVehicleId(invoice.getRoService().getVehicleId());
			String vehicleVIN = vehicle.getVehicleVIN();
			String vehicleRegNo = vehicle.getVehicleRegistrationNumber();
			String vehicleColor = vehicle.getVehicleColor();
			int vehicleId = vehicle.getVehicleId();
			
			Employee employee = employeeRepository.findByEmployeeId(invoice.getRoService().getEmployeeAsMechanic());
			System.out.println("............ employee "+employee);
			String mechanicFirstName = employee.getEmployeeFirstname();
			String mechanicLastName = employee.getEmployeeLastname();
			int mechanicId = employee.getEmployeeId();

			
			map.put("status", status);
			map.put("invoiceNumber", invoiceNumber);
			map.put("preInvoiceGenDate", invoiceDate);
			map.put("roNumber", roNumber);
			map.put("servicingStatus", ServicingStatus);
			map.put("arrivalDate", arrivalDate);
			map.put("promisedDate", promisedDate);
			map.put("custFirstName", custFirstName);
			map.put("custLastName", custLastName);
			map.put("custAddress", custAddress);
			map.put("vehicleVIN", vehicleVIN);
			map.put("vehicleRegNo", vehicleRegNo);
			map.put("vehicleColor", vehicleColor);
			map.put("mechanicFirstName", mechanicFirstName);
			map.put("mechanicLastName", mechanicLastName);
			map.put("custId",custId);
			map.put("vehicleId", vehicleId);
			map.put("mechanicId", mechanicId);
			map.put("custMobileno", custMobNo);
			map.put("paymentStatus", paymentStatus);
			map.put("roCreatedDate", roCreatedDate);
			map.put("extendedDate", extendedDate);
			map.put("reopenFlag", reopenFlag);
			map.put("invoiceId", invoiceId);
			map.put("roserviceId", roserviceId);

			objList.add(map);

		}

		return objList;
	}
	

	@Override
	public void saveLabourChargesDetails(List<ROLabourChargesDetails> labourChargesDetails) {
		for(ROLabourChargesDetails roLabour : labourChargesDetails) {
			labourChargesRepository.save(roLabour);
		}		
	}

	@Override
	public List<ROLabourChargesDetails> getLabourCharges() {
		return (List<ROLabourChargesDetails>) labourChargesRepository.findAll();
	}

	@Override
	public String getLabourNameById(int id) {
		ROLabourChargesDetails labour = labourChargesRepository.findByRoLabourId(id);
		return labour.getDescription();
	}

	@Override
	public void updatePreInvoiceEntryAsPaid(String invoiceNo, InvoiceTable invoice) {
		invoiceRepository.updatePaymentStatusAsPaid(invoiceNo);	
		//invoiceRepository.save(invoice);
	}

	@Override
	public Status getStatusId(String statusName) {
		Status status = statusRepository.findByStatusName(statusName);
		System.out.println("status impl  :: "+status);
		return status;
	}

	@Override
	public List<Map<Object, Object>> getDataForClosedService() {
		List<Map<Object, Object>> objList = new ArrayList<>();
		Map<Object, Object> map = null;
		
		List<InvoiceTable> list = invoiceRepository.getDataForClosedService();
		
		objList = getData(list);
		return objList;
	}

	@Override
	public void updateStatus(String invoiceNo, int status, int reopenFlag, InvoiceTable invoice) {
		//invoiceRepository.updateStatus(invoiceNo, status, reopenFlag);
		System.out.println("updateeee   status   :   "+invoice);
		invoiceRepository.save(invoice);				
	}
}
