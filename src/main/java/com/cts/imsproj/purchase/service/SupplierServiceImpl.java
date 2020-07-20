package com.cts.imsproj.purchase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.purchase.DAO.SupplierRepository;
import com.cts.imsproj.purchase.entity.Supplier;

@Transactional
@Service
public class SupplierServiceImpl {

    @Autowired
    private SupplierRepository supplierRepository;

    public void insert(Supplier supplier) {
        supplierRepository.save(supplier);
    }


    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public void updateSupplier(Supplier supplier) {

        supplierRepository.save(supplier);
    }

    public void deleteSupplier(int id) {

        supplierRepository.deleteById(id);;
    }
}
