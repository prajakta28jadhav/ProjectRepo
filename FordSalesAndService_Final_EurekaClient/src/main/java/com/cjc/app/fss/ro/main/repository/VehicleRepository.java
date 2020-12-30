package com.cjc.app.fss.ro.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.VehicleDetails;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleDetails, Integer> {

	VehicleDetails findByVehicleVIN(String vin);

	VehicleDetails findByVehicleRegistrationNumber(String registrationNo);

	List<VehicleDetails> findByCustomerDetails_CustomerId(int customerId);

	VehicleDetails findByVehicleId(int id);



}
