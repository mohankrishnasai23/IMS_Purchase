package com.cts.imsproj.purchase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.RawMaterials;

@Service
public interface RawService {

	public List<RawMaterials> getAll();

	public RawMaterialsDto addRaw(RawMaterialsDto r);

	public RawMaterialsDto updateRaw(RawMaterialsDto r);

	public void deleteRaw(int id);

	
}
