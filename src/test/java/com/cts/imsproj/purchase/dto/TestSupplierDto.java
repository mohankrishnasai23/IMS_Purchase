package com.cts.imsproj.purchase.dto;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestSupplierDto {
	
	@Test
	public void setSupplierId() {
		SupplierDto dto = new SupplierDto();
		dto.setQnty(11);
		assertEquals(dto.getQnty(),11);
	}
	
	@Test
	public void getSupplierId() {
		SupplierDto dto = new SupplierDto();
		dto.setQnty(11);
		assertEquals(dto.getQnty(),11);
	}
	
	@Test
	public void setSupplierName() {
		SupplierDto dto = new SupplierDto();
		dto.setSupplierName("aaa");
		assertTrue(dto.getSupplierName()=="aaa");
	}
	
	@Test
	public void getSupplierName() {
		SupplierDto dto = new SupplierDto();
		dto.setSupplierName("aaa");
		assertTrue(dto.getSupplierName()=="aaa");
	}
	
	@Test
	public void setSupplierContact() {
		SupplierDto dto = new SupplierDto();
		dto.setSupplierContact(9440);
		assertEquals(dto.getSupplierContact(),9440);
	}
	
	@Test
	public void getSupplierContact() {
		SupplierDto dto = new SupplierDto();
		dto.setSupplierContact(9440);
		assertEquals(dto.getSupplierContact(), 9440);
	}
	
	@Test
	public void setSupplierCompany() {
		SupplierDto dto = new SupplierDto();
		dto.setSupplierCompany("mrf");
		assertTrue(dto.getSupplierCompany()=="mrf");
	}
	
	@Test
	public void getSupplierCompany() {
		SupplierDto dto = new SupplierDto();
		dto.setSupplierCompany("mrf");
		assertTrue(dto.getSupplierCompany()=="mrf");
	}
	
	@Test
	public void setSupplierQty() {
		SupplierDto dto = new SupplierDto();
		dto.setQnty(1);
		assertEquals(dto.getQnty(),1);
	}
}
