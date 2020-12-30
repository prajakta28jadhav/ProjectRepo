package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.VehicleDetails;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findByProductId(int id);

	

	
}
