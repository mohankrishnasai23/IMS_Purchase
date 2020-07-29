package com.cts.imsproj.purchase.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.imsproj.purchase.entity.Supplier;
import com.cts.imsproj.purchase.service.SupplierServiceImpl;


@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierServiceImpl supplierService;

    @RequestMapping("/getall")
    public Iterable<Supplier> getAllSupplier() throws SupplierNotFoundException{
        return supplierService.findAll();
    }

    @RequestMapping("find/{id}")
    public Optional<Supplier> searchSupplier (@PathVariable int id) throws SupplierNotFoundException{
        return supplierService.findById(id);
    }

    @PostMapping("/add")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        supplierService.insert(supplier);
        return supplier;
    }

    @PutMapping("/update")
    public Supplier updateSupplier(@RequestBody Supplier supplier) throws SupplierNotFoundException{
        supplierService.updateSupplier(supplier);
        return supplier;
    }

    @DeleteMapping("delete/{id}")
    public String deleteSupplier(@PathVariable int id) throws SupplierNotFoundException{
    	supplierService.deleteSupplier(id);
    	return "Deleted Successfully";
    }
}
