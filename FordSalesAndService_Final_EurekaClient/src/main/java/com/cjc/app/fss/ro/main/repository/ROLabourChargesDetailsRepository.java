package com.cjc.app.fss.ro.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.ROLabourChargesDetails;
import com.cjc.app.fss.ro.main.model.VehicleDetails;

@Repository
public interface ROLabourChargesDetailsRepository extends CrudRepository<ROLabourChargesDetails, Integer> {

	ROLabourChargesDetails findByRoLabourId(int id);

}
