package com.cts.imsproj.purchase.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.cts.imsproj.purchase.dao.RawRepoImpl;
import com.cts.imsproj.purchase.dao.SupplierRepository;
import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.service.RawServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@TestInstance(Lifecycle.PER_CLASS)
class RawServiceImplTest {

	@Mock
	RawRepoImpl repo;
	
	@Mock
	SupplierRepository supplierRepository;

	@InjectMocks
	RawServiceImpl rawServiceImpl;
	RawMaterials rm=getRawMaterial();
	List<RawMaterials> allItems=getAllRawMaterials();
	RawMaterialsDto  dto= getRawMaterialDto();
	@BeforeAll
	public void init() {
	    MockitoAnnotations.initMocks(this);
	}
	@Test
	void testGetAll() {
		when(repo.getAll()).thenReturn(allItems);
		assertEquals(allItems.size(), rawServiceImpl.getAll().size());
		verify(repo,times(1));
	}

	@Test
	void testAddRaw() {
	}

	@Test
	void testUpdateRaw() {
		when(repo.updateRaw(Mockito.any(RawMaterials.class))).thenReturn(rm);
		assertEquals(rm.getId(),rawServiceImpl.updateRaw(dto).getId());
	
	}

	@Test
	void testDeleteRaw() {
	}

	@Test
	void testUpdateQty() {
	}

	private List<RawMaterials> getAllRawMaterials() {
		List<RawMaterials> l=new ArrayList<RawMaterials>();
		l.add(new RawMaterials());
		l.add(new RawMaterials());
		return l;
	}
	private RawMaterials getRawMaterial() {
		
		RawMaterials rawMaterial = new RawMaterials();
		rawMaterial.setId(1001);
		return rawMaterial;
	}
	
	private RawMaterialsDto getRawMaterialDto() {
		RawMaterialsDto dto= new RawMaterialsDto();
		return dto;
	}
}
