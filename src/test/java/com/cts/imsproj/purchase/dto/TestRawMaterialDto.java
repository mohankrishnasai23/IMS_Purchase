package com.cts.imsproj.purchase.dto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cts.imsproj.purchase.entity.Supplier;

public class TestRawMaterialDto {

	
	@Test
	public void testSetId() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setId(111);
		assertTrue(dto.getId()== 111);
	}
	
	@Test
	public void testSetId_1() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setId(111);
		assertTrue(dto.getId()== 00);
	}
	
	@Test
	public void testgetId() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setId(111);
		assertTrue(dto.getId()== 111);
	}
	
	@Test
	public void testSetname() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setName("sss");
		assertTrue(dto.getName()== "sss");
	}
	
	@Test
	public void testGetname() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setName("sss");
		assertTrue(dto.getName()== "sss");
	}
	
	@Test
	public void testSetLocation() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setLocation("");
		assertTrue(dto.getName()== "");
	}
	
	@Test
	public void testSetLocation_1() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setLocation("sasa");
		assertTrue(dto.getLocation()== "");
	}
	
	@Test
	public void testGetLocation() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setLocation("sasa");
		assertTrue(dto.getLocation()== "sasa");
	}
	
	@Test
	public void testSetPrice() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setPrice(2000);
		assertTrue(dto.getPrice()== 2000);
	}
	
	@Test
	public void testSetPrice_1() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setPrice(0);
		assertTrue(dto.getPrice()== 2000);
	}
	
	@Test
	public void testGetPrice() {
		RawMaterialsDto dto = new RawMaterialsDto();
		dto.setPrice(2000);
		assertTrue(dto.getPrice()== 2000);
	}
	
	@Test
	public void testSupplier() {
		RawMaterialsDto dto = new RawMaterialsDto();
		Supplier supplier = new Supplier();
		supplier.setQnty(1);
		supplier.setSupplierCompany("mrf");
		supplier.setSupplierContact(9440);
		supplier.setSupplierId(100);
		supplier.setSupplierName("saaa");
		dto.setSupplier(supplier);
		
		assertEquals(dto.getSupplier(), supplier);
	}
}
