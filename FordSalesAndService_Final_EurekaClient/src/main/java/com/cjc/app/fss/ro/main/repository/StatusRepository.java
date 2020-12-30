package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cjc.app.fss.ro.main.model.Status;


@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {

	Status findByStatusName(String statusName);

	

	
}
