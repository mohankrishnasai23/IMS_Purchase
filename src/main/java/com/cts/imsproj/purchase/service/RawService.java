package com.cts.imsproj.purchase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.entity.RawMaterials;

@Service
public interface RawService {

	public List<RawMaterials> getAll();

	public RawMaterials addRaw(RawMaterials r);

	public RawMaterials updateRaw(RawMaterials r);

	public void deleteRaw(int id);

	
}
