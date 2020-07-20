package com.cts.imsproj.purchase.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.imsproj.purchase.entity.RawMaterials;

@Repository
public class RawRepoImpl {

	@Autowired
	private RawRepo rp;
	
	public List<RawMaterials> getAll(){
		
		List<RawMaterials> list = rp.findAll();
		
		return list;
	}

	public RawMaterials addRaw(RawMaterials r) {
		
		RawMaterials rm = rp.save(r);
		
		return rm;
	}

	public RawMaterials updateRaw(RawMaterials r) {

		RawMaterials rm = rp.save(r);
		return rm;
	}

	public void deleteRaw(int id) {
		if(rp.findById(id).isPresent()) {
		rp.deleteById(id);
		}
	}
}
