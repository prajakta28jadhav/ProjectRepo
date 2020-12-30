package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.Employee;
import com.cjc.app.fss.ro.main.model.VehicleDetails;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findByEmployeeId(int i);

	
}
