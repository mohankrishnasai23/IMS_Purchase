package com.cts.imsproj.purchase.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.imsproj.purchase.dto.SupplierDto;
import com.cts.imsproj.purchase.entity.Supplier;
import com.cts.imsproj.purchase.service.SupplierServiceImpl;

public class TestSupplierController {

	@InjectMocks
	private SupplierController supplierController ;
	@Mock
	private SupplierServiceImpl supplierService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllSupplier() {
		Iterable<Supplier> iterable = new ArrayList<Supplier>();
		when(supplierService.findAll()).thenReturn(iterable);
		Iterable<Supplier> actualIterable = supplierController.getAllSupplier();
		assertEquals(iterable, actualIterable);
	}
	
	@Test
	public void testSearchSupplier() {
		Optional<Supplier> optional = Optional.of(new Supplier());
		when(supplierService.findById(123)).thenReturn(optional);
		Optional<Supplier> actualOptional = supplierController.searchSupplier(123);
		assertEquals(optional, actualOptional);
	}
	
	@Test
	public void testAddSupplier() {
		SupplierDto supplier = new SupplierDto();
		supplier.setQnty(1);
		supplier.setSupplierCompany("mrf");
		supplier.setSupplierContact(9440);
		supplier.setSupplierId(100);
		supplier.setSupplierName("saaa");
		SupplierDto actualSupplier = supplierController.addSupplier(supplier) ;
		verify(supplierService).insert(supplier);
		assertEquals(supplier, actualSupplier);
	}
	
	@Test
	public void testUpdateSupplier() {
		SupplierDto supplier = new SupplierDto();
		supplier.setQnty(1);
		supplier.setSupplierCompany("mrf");
		supplier.setSupplierContact(9440);
		supplier.setSupplierId(100);
		supplier.setSupplierName("saaa");
		SupplierDto actualSupplier = supplierController.updateSupplier(supplier);
		verify(supplierService).updateSupplier(supplier);
		assertEquals(supplier, actualSupplier);
	}
	@Test
	public void testDeleteSupplier() {
		String result = supplierController.deleteSupplier(123);
		verify(supplierService).deleteSupplier(123);
		assertEquals("Deleted Successfully", result);
	}
}
