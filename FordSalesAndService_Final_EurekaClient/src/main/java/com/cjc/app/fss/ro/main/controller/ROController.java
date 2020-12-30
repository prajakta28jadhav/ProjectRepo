package com.cjc.app.fss.ro.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.DailyStockDetails;
import com.cjc.app.fss.ro.main.model.Employee;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ROLabourChargesDetails;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.Status;
import com.cjc.app.fss.ro.main.model.VehicleDetails;
import com.cjc.app.fss.ro.main.service.ROService;

@CrossOrigin("*")
@RestController
@RequestMapping("/newService")
public class ROController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ROService service;

	@PostMapping("/save")
	public String saveVehicleData(@RequestBody VehicleDetails vehicle) {
		service.save(vehicle);
		return "success";
	}
	
	@GetMapping("/getNewServiceDetailsByVIN/{VIN}")
	public VehicleDetails getCustomerAndVehicleDetailsUsingVIN(@PathVariable("VIN") String VIN) {
		VehicleDetails list = service.getVehicleDetails(VIN);
		System.out.println("1111111111111      ::::::::::: "+list);
		return list;
	}

	@GetMapping("/getNewServiceDetailsByRegNo/{RegNo}")
	public VehicleDetails getCustomerAndVehicleDetailsUsingRegNo(@PathVariable("RegNo") String registrationNo) {		
		VehicleDetails vehicle = service.getVehicleDetailsByRegNo(registrationNo);
		return vehicle;
	}

	@GetMapping("/getCustomerIdByMobileNo/{MobileNo}")
	public List<VehicleDetails> getCustomerIdUsingMobileNo(@PathVariable("MobileNo") long mobileNo) {
		System.out.println("22222222222 ");
		List<VehicleDetails> list = service.getCustomerByMobileNo(mobileNo);
		return list;
	}

	@GetMapping("/getAllServiceType")
	public List<ServiceType> getAllServiceType() {
		List<ServiceType> list = service.getServicingType();
		return list;
	}

	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Product product) {		
		service.saveProduct(product);
		return "success";
	}
	
	@GetMapping("/getAllProductDetails")
	public List<Product> getAllProduct() {		
		List<Product> list = service.getAllProducts();
		return list;
	}

	@GetMapping("/getAllLabourDetails")
	public List<Employee> getAllLabourDetails() {
		String url = "http://zuul/getMaster/getAllLabourDetails";
		List<Employee> list = restTemplate.getForObject(url, List.class);
		return list;
	}

	@GetMapping("/getStockDetailsByProductId/{productId}")
	public DailyStockDetails getStockDetailsByProductId(@PathVariable("productId") int prodId) {
		DailyStockDetails stock = service.getStockByProductId(prodId);
		System.out.println(stock);
		return stock;
	}
	
	@PostMapping("/saveNewServiceFormData")
	public String saveNewServiceFormData(@RequestBody InvoiceTable invoice) {
		
		System.out.println("--------\n before save   "+invoice);
		
		System.out.println("ppppppppppppppppp      "+invoice.getRoService().getRoNumber());
		service.saveInvoiceData(invoice);
		return "success";
	}
	
	@GetMapping("/getVehicleCustDataByVehicleId/{id}")
	public VehicleDetails getDataByVehicleId(@PathVariable("id") int id) {
		VehicleDetails vehicle = service.getDataByVehicleId(id);
		return vehicle;
	}
	
	@GetMapping("/getProductNameById/{id}")
	public String getProductNameById(@PathVariable("id") int id){
		String name = service.getProductNameById(id);
		System.out.println("11111  name  "+name);
		return name;
	
	}
	
	@GetMapping("/getDataForOpenService")
	public List<Map<Object, Object>> getDataForOpenService(){
		return service.getDataForOpenService();
	}
	
	@PostMapping("/saveLabourDetails")
	public String saveLabourDetails(@RequestBody List<ROLabourChargesDetails> labourChargesDetails) {
		service.saveLabourChargesDetails(labourChargesDetails);
		return "success";
		
	}
	
	@GetMapping("/getLabourCharges")
	public List<ROLabourChargesDetails> getLabourChargesDetails(){
		List<ROLabourChargesDetails> list = service.getLabourCharges();
		return list;
	}
	
	@GetMapping("/getLabourNameById/{id}")
	public String getLabourNameById(@PathVariable("id") int id){
		String name = service.getLabourNameById(id);
		System.out.println("labour  name  "+name);
		return name;
	
	}
	
	@PutMapping("/updatePreInvoiceEntryAsPaid/{invoiceNo}")
	public String updatePreInvoiceEntryAsPaid(@PathVariable("invoiceNo") String invoiceNo, @RequestBody InvoiceTable invoice ) {
		System.out.println("zzzzz   "+ invoiceNo);
		service.updatePreInvoiceEntryAsPaid(invoiceNo,invoice);
		return "Updated";
	} 
	
	@GetMapping("/getStatusIdByStatusName/{statusName}")
	public Status getStatusIdByStatusName(@PathVariable("statusName") String statusName){
		System.out.println("in method status");
		Status status = service.getStatusId(statusName);
		System.out.println("Statussssss :  " +status.getStatusId());
		return status;
	}
	
	@GetMapping("/getDataForClosedService")
	public List<Map<Object, Object>> getDataForClosedService(){
		List<Map<Object, Object>> list = service.getDataForClosedService();
		return list;
	}
	
	@PutMapping("/updateStatus/{invoiceNo}/{status}/{reopenFlag}")
	public String updateStatus(@PathVariable("invoiceNo") String invoiceNo, @PathVariable("status") int status,
			@PathVariable("reopenFlag") int reopenFlag, @RequestBody InvoiceTable invoice )
	{
		System.out.println("statusss : "+invoiceNo+" | "+reopenFlag+" | "+status+"  invoicse   : "+invoice);
		service.updateStatus(invoiceNo, status, reopenFlag, invoice);
		return "Updated";
	}
}
