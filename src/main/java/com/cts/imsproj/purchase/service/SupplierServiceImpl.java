package com.cts.imsproj.purchase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.dao.SupplierRepository;
import com.cts.imsproj.purchase.dto.SupplierDto;
import com.cts.imsproj.purchase.entity.Supplier;

@Transactional
@Service
public class SupplierServiceImpl {

    @Autowired
    private SupplierRepository supplierRepository;

    public void insert(SupplierDto supplier) {
    	Supplier entity = new Supplier();
    	BeanUtils.copyProperties(supplier, entity);
        supplierRepository.save(entity);
    }


    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public void updateSupplier(SupplierDto supplier) {
    	Supplier entity = new Supplier();
    	BeanUtils.copyProperties(supplier, entity);
        supplierRepository.saveAndFlush(entity);
    }

    public void deleteSupplier(int id) {

        supplierRepository.deleteById(id);
    }
}
