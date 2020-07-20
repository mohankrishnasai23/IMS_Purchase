package com.cts.imsproj.purchase.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.entity.Supplier;

@Service
public interface SupplierService {

	public void insert(Supplier supplier);
	
	public Optional<Supplier> findById(int id);
	
	public Iterable<Supplier> findAll();
	
	public void updateSupplier(Supplier supplier);
	
	public void deleteSupplier(int id);
	
}
