package com.cts.imsproj.purchase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.imsproj.purchase.dao.SupplierRepository;
import com.cts.imsproj.purchase.entity.Supplier;

@SpringBootTest
class ImsPurchasingDeptApplicationTests {

	@Autowired
	SupplierRepository sprepo;
	@Test
	void contextLoads() {
	}
	
	@Test
	void addSuppliers() {
		Supplier sp = new Supplier();
		sp.setSupplierName("mani");
		sp.setSupplierId(1);
		sp.setSupplierContact(8500);
		sp.setSupplierCompany("MRF");
		
		sprepo.save(sp);
	}

}
