package com.cts.imsproj.purchase.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

import com.cts.imsproj.purchase.entity.RawMaterials;

public class RawRepoImplTest {
	
	@InjectMocks
	private RawRepoImpl rawRepoImpl;
	@Mock
	private RawRepo repo;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll() {
		List<RawMaterials> expectedRawMaterials =  new ArrayList<>();
		when(repo.findAll()).thenReturn(expectedRawMaterials) ;
		List<RawMaterials> actualRawMaterials = rawRepoImpl.getAll();
		assertEquals(expectedRawMaterials, actualRawMaterials);
	}
	
	@Test
	public void testAddRaw() {
		RawMaterials expectedRawMaterials = new RawMaterials();
		RawMaterials actualRawMaterials = new RawMaterials();
		when(repo.save(expectedRawMaterials)).thenReturn(actualRawMaterials) ;
		RawMaterials materials = rawRepoImpl.addRaw(expectedRawMaterials);
		assertEquals(actualRawMaterials, materials);
	}
	@Test
	public void testUpdateRaw() {
		RawMaterials rawMaterials = new RawMaterials();
		RawMaterials expectedRawMaterials = new RawMaterials();
		when(repo.saveAndFlush(rawMaterials)).thenReturn(expectedRawMaterials);
		RawMaterials actualRawMaterials = rawRepoImpl.updateRaw(rawMaterials);
		assertEquals(expectedRawMaterials, actualRawMaterials);
	}
	
	@Test
	public void testDeleteRaw() {
		Optional<RawMaterials> ids = Mockito.mock(Optional.class) ;
		when(repo.findById(123)).thenReturn(ids);
		when(ids.isPresent()).thenReturn(true);
		rawRepoImpl.deleteRaw(123);
	}
	@Test
	public void testDeleteRaw_else() {
		Optional<RawMaterials> ids = Mockito.mock(Optional.class) ;
		when(repo.findById(123)).thenReturn(ids);
		when(ids.isPresent()).thenReturn(false);
		rawRepoImpl.deleteRaw(123);
	}

}
