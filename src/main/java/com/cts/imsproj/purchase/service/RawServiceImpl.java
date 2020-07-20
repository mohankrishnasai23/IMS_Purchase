package com.cts.imsproj.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.DAO.RawRepoImpl;
import com.cts.imsproj.purchase.entity.RawMaterials;

@Service
public class RawServiceImpl implements RawService{

	@Autowired
	RawRepoImpl rp;
	
	public List<RawMaterials> getAll() {
		
		List<RawMaterials> list = rp.getAll();
		
		return list;
	}

	public RawMaterials addRaw(RawMaterials r) {
		RawMaterials rm = rp.addRaw(r);
		return rm;
	}

	@Override
	public RawMaterials updateRaw(RawMaterials r) {
		RawMaterials rm = rp.updateRaw(r);
		return rm;
	}

	@Override
	public void deleteRaw(int id) {

		rp.deleteRaw(id);
		
	}
	
	/*
	 * public RawMaterials addRaw(RawMaterials rm) { RawMaterials rm = }
	 */
}
