package com.cjc.app.fss.ro.main.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.VehicleDetails;

@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceTable, Integer> {

	@Query("select a from "
			+ " InvoiceTable a"
			+ " join a.roService b"
			+ " join b.status c"			
			+ " where ((c.statusName ='Open' and a.reopenFlag = 0) or (c.statusName = 'Reopen' and a.reopenFlag = 1))")
	List<InvoiceTable> getDataForOpenService();

	@Modifying
	@Transactional
	@Query("Update InvoiceTable a Set a.paymentStatus='Paid', a.reopenFlag = 1 where a.invoiceNo=:invoiceno")
	void updatePaymentStatusAsPaid(@Param("invoiceno") String invoiceNo);

	
	@Query("select a from "
			+ " InvoiceTable a"
			+ " join a.roService b"
			+ " join b.status c"			
			+ " where c.statusName ='Closed' and a.paymentStatus='Paid' and b.extendedDate >= now()")
	List<InvoiceTable> getDataForClosedService();

	
}
