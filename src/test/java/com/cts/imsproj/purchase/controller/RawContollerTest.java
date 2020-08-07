package com.cts.imsproj.purchase.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.Category;
import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.entity.Supplier;
import com.cts.imsproj.purchase.service.RawService;

public class RawContollerTest {

	@InjectMocks
	private RawController rawController;
	@Mock
	private RawService rs;
	/*
	 * @Mock private CategoryClient client;
	 */
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll() {
		List<RawMaterials> rawMaterials = new ArrayList<>();
		when(rs.getAll()).thenReturn(rawMaterials);
		List<RawMaterials> actualRawMaterials = rawController.getAll();
		assertEquals(rawMaterials, actualRawMaterials);
	}
	
	@Test
	public void testAddRawMaterials() {
		RawMaterialsDto dto = new RawMaterialsDto();
		Supplier supplier = new Supplier();
		supplier.setQnty(1);
		supplier.setSupplierCompany("mrf");
		supplier.setSupplierContact(9440);
		supplier.setSupplierId(100);
		supplier.setSupplierName("saaa");
		dto.setId(123);
		dto.setLocation("hyd");
		dto.setName("krish");
		dto.setPrice(1000);
		dto.setSupplier(supplier);
		when(rs.addRaw(dto)).thenReturn(dto) ;
		RawMaterialsDto actualRawMaterialsDto = rawController.addRawMaterials(dto);
		assertEquals(dto, actualRawMaterialsDto);
	}
	
	@Test
	public void testUpdateRawMaterials() {
		RawMaterialsDto dto = new RawMaterialsDto();
		Supplier supplier = new Supplier();
		supplier.setQnty(1);
		supplier.setSupplierCompany("mrf");
		supplier.setSupplierContact(9440);
		supplier.setSupplierId(100);
		supplier.setSupplierName("saaa");
		dto.setId(123);
		dto.setLocation("hyd");
		dto.setName("krish");
		dto.setPrice(1000);
		dto.setSupplier(supplier);
		when(rs.updateRaw(dto)).thenReturn(dto);
		RawMaterialsDto actualRawMaterialsDto = rawController.updateRawMaterials(dto) ;
		assertEquals(dto, actualRawMaterialsDto);
	}
	
	@Test
	public void testDeleteRaw() {
		assertEquals("Deleted Successfully", rawController.deleteRaw(123));
		verify(rs).deleteRaw(123);
	}
	/*
	 * @Test public void testGetAllCategory() { List<Category> categories = new
	 * ArrayList<>(); when(client.getAllCategory()).thenReturn(categories);
	 * List<Category> actualCategories= rawController.getAllCategory();
	 * assertEquals(categories, actualCategories); }
	 */
}
