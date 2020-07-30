package com.cts.imsproj.purchase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.imsproj.purchase.dao.RawRepo;
import com.cts.imsproj.purchase.dao.RawRepoImpl;
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
	public void testgetAll() {
		List<RawMaterials> expectedRawMaterials = new ArrayList<>();
		when(repo.findAll()).thenReturn(expectedRawMaterials);
		List<RawMaterials> actualRawMaterials = rawRepoImpl.getAll();
		assertEquals(expectedRawMaterials, actualRawMaterials);
	}

	@Test
	public void testAdd() {
		RawMaterials rawMaterials = new RawMaterials();
		when(repo.save(rawMaterials)).thenReturn(rawMaterials);
		RawMaterials addRaw = rawRepoImpl.addRaw(rawMaterials);
		assertEquals(rawMaterials, addRaw);
	}

	@Test
	public void testUpdate() {
		RawMaterials rawMaterials = new RawMaterials();
		when(repo.saveAndFlush(rawMaterials)).thenReturn(rawMaterials);
		RawMaterials updateRaw = rawRepoImpl.updateRaw(rawMaterials);
		assertEquals(rawMaterials, updateRaw);
	}

	/*
	 * @Test public void testDelete() { RawMaterials rawMaterials = new
	 * RawMaterials(); int id = rawMaterials.getId(); EasyMock.expectLastCall();
	 * rawRepoImpl.deleteRaw(id); EasyMock.replay(rawRepoImpl); verify(rawRepoImpl);
	 * }
	 */
}
