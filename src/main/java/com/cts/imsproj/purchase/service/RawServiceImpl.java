package com.cts.imsproj.purchase.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.dao.RawRepoImpl;
import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.RawMaterials;

@Service
public class RawServiceImpl implements RawService{

	@Autowired
	RawRepoImpl rp;
	
	public List<RawMaterials> getAll() {
		
		List<RawMaterials> list = rp.getAll();
		
		return list;
	}

	@Override
	public RawMaterialsDto addRaw(RawMaterialsDto r) {
		RawMaterials rm = new RawMaterials();
		BeanUtils.copyProperties(r, rm);
		
		RawMaterials rm1 = rp.addRaw(rm);
		BeanUtils.copyProperties(rm1, r);
		
		return r;
	}

	@Override
	public RawMaterialsDto updateRaw(RawMaterialsDto r) {
		RawMaterials rm = new RawMaterials();
		BeanUtils.copyProperties(r, rm);
		RawMaterials rm1 = rp.updateRaw(rm);
		BeanUtils.copyProperties(rm1, r);
		return r;
	}

	@Override
	public void deleteRaw(int id) {

		rp.deleteRaw(id);
		
	}
	
}
