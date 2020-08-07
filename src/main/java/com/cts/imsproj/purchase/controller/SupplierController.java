package com.cts.imsproj.purchase.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.imsproj.purchase.dto.SupplierDto;
import com.cts.imsproj.purchase.entity.Supplier;
import com.cts.imsproj.purchase.handler.PurchaseDepartmentException;
import com.cts.imsproj.purchase.service.SupplierServiceImpl;

import io.swagger.annotations.Api;


/**
 * @author Mohankrishna sai
 *
 */
@Api("Describes the SupplierController")
@RestController
@RequestMapping("/suppliers")
public class SupplierController {

	private static Logger logger = LoggerFactory.getLogger(SupplierController.class);
    @Autowired
    private SupplierServiceImpl supplierService;

    /**
     * @return
     * @throws PurchaseDepartmentException
     */
    @GetMapping("/getall")
    public List<Supplier> getAllSupplier() {
    	logger.info("Triggered findAll Method");
        return (List<Supplier>) supplierService.findAll();
    }

    /**
     * @param id
     * @return
     * @throws PurchaseDepartmentException
     */
    @GetMapping("find/{id}")
    public Optional<Supplier> searchSupplier (@PathVariable int id) {
    	if(id == 0)
    		throw new PurchaseDepartmentException("Id should not be zero");
        return supplierService.findById(id);
    }

    /**
     * @param supplier
     * @return
     */
    @PostMapping("/add")
    public SupplierDto addSupplier(@RequestBody SupplierDto supplier) {
    	if(supplier.getSupplierCompany() == null || supplier.getSupplierName() == null || supplier.getSupplierId()==0) { 
    		throw new PurchaseDepartmentException("Data shouldn't be null");
    	}
        supplierService.insert(supplier);
        return supplier;
    }

    @PutMapping("/update")
    public SupplierDto updateSupplier(@RequestBody SupplierDto supplier) {
    	if(supplier.getSupplierCompany() == null || supplier.getSupplierName() == null || supplier.getSupplierId()==0) {
    		throw new PurchaseDepartmentException("Data shouldn't be null");
    	}
    		supplierService.updateSupplier(supplier);
        return supplier;
    }

    @DeleteMapping("delete/{id}")
    public String deleteSupplier(@PathVariable int id) {
    	supplierService.deleteSupplier(id);
    	return "Deleted Successfully";
    }
}
