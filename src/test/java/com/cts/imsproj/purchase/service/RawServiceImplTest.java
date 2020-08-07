package com.cts.imsproj.purchase.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.BeanUtils;

import com.cts.imsproj.purchase.dao.RawRepoImpl;
import com.cts.imsproj.purchase.dao.SupplierRepository;
import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.entity.Supplier;

public class RawServiceImplTest {

	@InjectMocks
	private RawServiceImpl rawServiceImpl;
	@Mock
	private RawRepoImpl repo;
	@Mock
	private SupplierRepository supplierRepository;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAll() {
		List<RawMaterials> rawMaterials = new ArrayList<RawMaterials>();
		when(repo.getAll()).thenReturn(rawMaterials);

		List<RawMaterials> list = rawServiceImpl.getAll();
		assertEquals(list, rawMaterials);
	}

	
	/*
	 * @Test public void testAddRaw() { Supplier supplier = new Supplier();
	 * supplier.setSupplierId(123); RawMaterialsDto rawMaterialsDto = new
	 * RawMaterialsDto(); rawMaterialsDto.setId(123);
	 * rawMaterialsDto.setSupplier(supplier); List<RawMaterials> rawMaterials = new
	 * ArrayList<RawMaterials>(); RawMaterials rawMaterial = new RawMaterials();
	 * rawMaterial.setSupplier(supplier);
	 * when(repo.getAll()).thenReturn(rawMaterials); Optional<Supplier> ids =
	 * Optional.of(supplier);
	 * when(supplierRepository.findById(123)).thenReturn(ids);
	 * when(supplierRepository.save(Mockito.any(Supplier.class))).thenReturn(
	 * supplier);
	 * 
	 * rawServiceImpl.addRaw(rawMaterialsDto); }
	 */
	 
	
	@Test
	public void testAddRaw() {
		Supplier supplier = new Supplier();
		supplier.setSupplierId(123);
		RawMaterialsDto rawMaterialsDto = new RawMaterialsDto();
		rawMaterialsDto.setId(123);
		rawMaterialsDto.setSupplier(supplier);
		List<RawMaterials> rawMaterials = new ArrayList<RawMaterials>();
		RawMaterials rawMaterial = new RawMaterials();
		rawMaterial.setSupplier(supplier);
		when(repo.getAll()).thenReturn(rawMaterials);
		Optional<Supplier> ids = Optional.of(supplier) ;
		when(supplierRepository.findById(123)).thenReturn(ids);
		when(supplierRepository.save(Mockito.any(Supplier.class))).thenReturn(supplier) ;
		when(repo.addRaw(Mockito.any(RawMaterials.class))).thenReturn(rawMaterial) ;
		
		rawServiceImpl.addRaw(rawMaterialsDto) ;
	}

	@Test
	public void testDeleteRaw() {
		rawServiceImpl.deleteRaw(123);
		verify(repo).deleteRaw(123);
	}

	/*
	 * @Test public void testUpdateRaw() { RawMaterials dto = new RawMaterials();
	 * RawMaterialsDto dt = new RawMaterialsDto(); BeanUtils.copyProperties(dt,
	 * dto); Supplier supplier = new Supplier(); supplier.setQnty(1);
	 * supplier.setSupplierCompany("mrf"); supplier.setSupplierContact(9440);
	 * supplier.setSupplierId(100); supplier.setSupplierName("saaa");
	 * dto.setId(123); dto.setLocation("hyd"); dto.setName("krish");
	 * dto.setPrice(1000); dto.setSupplier(supplier); RawMaterials dto1 = new
	 * RawMaterials(); dto1.setId(123); dto1.setLocation("hyd");
	 * dto1.setName("krish"); dto1.setPrice(1000); dto1.setSupplier(supplier);
	 * rawServiceImpl.updateRaw(dt); verify(repo).updateRaw(dto1); }
	 */

}