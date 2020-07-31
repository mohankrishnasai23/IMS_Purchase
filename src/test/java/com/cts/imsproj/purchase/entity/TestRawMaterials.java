package com.cts.imsproj.purchase.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRawMaterials {
	
		@Test
		public void testSetId() {
			RawMaterials entity = new RawMaterials();
			entity.setId(111);
			assertTrue(entity.getId()== 111);
		}
		
		@Test
		public void testSetId_1() {
			RawMaterials entity = new RawMaterials();
			entity.setId(111);
			assertTrue(entity.getId()== 00);
		}
		
		@Test
		public void testgetId() {
			RawMaterials entity = new RawMaterials();
			entity.setId(111);
			assertTrue(entity.getId()== 111);
		}
		
		@Test
		public void testSetname() {
			RawMaterials entity = new RawMaterials();
			entity.setName("sss");
			assertTrue(entity.getName()== "sss");
		}
		
		@Test
		public void testGetname() {
			RawMaterials entity = new RawMaterials();
			entity.setName("sss");
			assertTrue(entity.getName()== "sss");
		}
		
		@Test
		public void testSetLocation() {
			RawMaterials entity = new RawMaterials();
			entity.setLocation("");
			assertTrue(entity.getName()== "");
		}
		
		@Test
		public void testSetLocation_1() {
			RawMaterials entity = new RawMaterials();
			entity.setLocation("sasa");
			assertTrue(entity.getLocation()== "");
		}
		
		@Test
		public void testGetLocation() {
			RawMaterials entity = new RawMaterials();
			entity.setLocation("sasa");
			assertTrue(entity.getLocation()== "sasa");
		}
		
		@Test
		public void testSetPrice() {
			RawMaterials entity = new RawMaterials();
			entity.setPrice(2000);
			assertTrue(entity.getPrice()== 2000);
		}
		
		@Test
		public void testSetPrice_1() {
			RawMaterials entity = new RawMaterials();
			entity.setPrice(0);
			assertTrue(entity.getPrice()== 2000);
		}
		
		@Test
		public void testGetPrice() {
			RawMaterials entity = new RawMaterials();
			entity.setPrice(2000);
			assertTrue(entity.getPrice()== 2000);
		}
		
		@Test
		public void testSupplier() {
			RawMaterials entity = new RawMaterials();
			Supplier supplier = new Supplier();
			supplier.setQnty(1);
			supplier.setSupplierCompany("mrf");
			supplier.setSupplierContact(9440);
			supplier.setSupplierId(100);
			supplier.setSupplierName("saaa");
			entity.setSupplier(supplier);
			
			assertEquals(entity.getSupplier(), supplier);
		}
	}