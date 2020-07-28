package com.cts.imsproj.purchase.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.imsproj.purchase.entity.RawMaterials;

@Repository
public class RawRepoImpl {

	@Autowired
	private RawRepo repo;
	
	public List<RawMaterials> getAll(){
		
		List<RawMaterials> list = repo.findAll();
		
		return list;
	}

	public RawMaterials addRaw(RawMaterials r) {
		
		RawMaterials rm = repo.save(r);
		
		return rm;
	}

	public RawMaterials updateRaw(RawMaterials r) {

		RawMaterials rm = repo.saveAndFlush(r);
		return rm;
	}

	public void deleteRaw(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
		}
	}
}
