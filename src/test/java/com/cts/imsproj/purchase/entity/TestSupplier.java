package com.cts.imsproj.purchase.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cts.imsproj.purchase.entity.Supplier;

public class TestSupplier {

	@Test
	public void setSupplierId() {
		Supplier entity = new Supplier();
		entity.setSupplierId(11);
		assertTrue(entity.getSupplierId()==11);
	}
	
	@Test
	public void getSupplierId() {
		Supplier entity = new Supplier();
		entity.setSupplierId(11);
		assertTrue(entity.getSupplierId()==11);
	}
	
	@Test
	public void setSupplierName() {
		Supplier entity = new Supplier();
		entity.setSupplierName("aaa");
		assertTrue(entity.getSupplierName()=="aaa");
	}
	
	@Test
	public void getSupplierName() {
		Supplier entity = new Supplier();
		entity.setSupplierName("aaa");
		assertTrue(entity.getSupplierName()=="aaa");
	}
	
	@Test
	public void setSupplierContact() {
		Supplier entity = new Supplier();
		entity.setSupplierContact(9440);
		assertTrue(entity.getSupplierContact()==9440);
	}
	
	@Test
	public void getSupplierContact() {
		Supplier entity = new Supplier();
		entity.setSupplierContact(9440);
		assertTrue(entity.getSupplierContact()==9440);
	}
	
	@Test
	public void setSupplierCompany() {
		Supplier entity = new Supplier();
		entity.setSupplierCompany("mrf");
		assertTrue(entity.getSupplierCompany()=="mrf");
	}
	
	@Test
	public void getSupplierCompany() {
		Supplier entity = new Supplier();
		entity.setSupplierCompany("mrf");
		assertTrue(entity.getSupplierCompany()=="mrf");
	}
	
	@Test
	public void setSupplierQty() {
		Supplier entity = new Supplier();
		entity.setQnty(1);
		assertTrue(entity.getQnty()==1);
	}

}
