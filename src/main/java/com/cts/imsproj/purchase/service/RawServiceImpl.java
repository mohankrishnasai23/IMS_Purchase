package com.cts.imsproj.purchase.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.dao.RawRepoImpl;
import com.cts.imsproj.purchase.dao.SupplierRepository;
import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.entity.Supplier;

@Service
public class RawServiceImpl implements RawService {

	@Autowired
	RawRepoImpl repo;

	@Autowired
	private SupplierRepository supplierRepository;

	public List<RawMaterials> getAll() {

		List<RawMaterials> list = repo.getAll();

		return list;
	}

	@Override
	public RawMaterialsDto addRaw(RawMaterialsDto r) {
		RawMaterials rm = new RawMaterials();
		BeanUtils.copyProperties(r, rm);
		updateQty(r);
		RawMaterials rm1 = repo.addRaw(rm);
		BeanUtils.copyProperties(rm1, r);
		return r;
	}

	@Override
	public RawMaterialsDto updateRaw(RawMaterialsDto r) {
		RawMaterials rm = new RawMaterials();
		BeanUtils.copyProperties(r, rm);
		RawMaterials rm1 = repo.updateRaw(rm);
		BeanUtils.copyProperties(rm1, r);
		return r;
	}

	@Override
	public void deleteRaw(int id) {

		repo.deleteRaw(id);

	}

	public void updateQty(RawMaterialsDto dto) {
		List<RawMaterials> all = getAll();
		int count = 1;
		int supplierId = dto.getSupplier().getSupplierId();
		for (RawMaterials rawMaterials : all) {
			if (rawMaterials.getSupplier().getSupplierId() == supplierId)
				count++;
		}
		if (count != 0) {
			java.util.Optional<Supplier> findById = supplierRepository.findById(supplierId);
			findById.get().setQnty(count);
			supplierRepository.save(findById.get());
		}
	}
}
