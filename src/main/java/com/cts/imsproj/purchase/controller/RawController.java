package com.cts.imsproj.purchase.controller;

import java.util.List;

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

/*import com.cts.imsproj.purchase.dao.CategoryClient;*/
import com.cts.imsproj.purchase.dto.RawMaterialsDto;
import com.cts.imsproj.purchase.entity.Category;
import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.handler.PurchaseDepartmentException;
import com.cts.imsproj.purchase.service.RawService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Mohankrishna sai
 *
 */

@Api("Describes the RawController")
@RestController
@RequestMapping("/api")
public class RawController {

	private static Logger logger = LoggerFactory.getLogger(RawController.class);
	@Autowired
	RawService rs;

	/*
	 * @Autowired CategoryClient client;
	 */

	/**
	 * @return list of Rawmaterials
	 */
	@ApiOperation("Retrieves all the RawMaterils in DB")
	@GetMapping("/getall")
	public List<RawMaterials> getAll() {
		logger.info("Retrieving all the RawMaterials from the DB");
		return rs.getAll();
	}

	/**
	 * @param Dto Object
	 * @return RawMaterialsDto
	 */
	@PostMapping("/add")
	public RawMaterialsDto addRawMaterials(@RequestBody RawMaterialsDto r) {
		logger.info("Adding RawMaterials to DB");
		if(r.getLocation()==null || r.getId()==0 || r.getName()==null || r.getPrice()==0) {
			throw new PurchaseDepartmentException("All fields should be added or should not be empty");
			}
		return rs.addRaw(r);
	}

	/**
	 * @param Dto Object
	 * @return RawMaterialsDto
	 */
	@PutMapping("/update")
	public RawMaterialsDto updateRawMaterials(@RequestBody RawMaterialsDto r) {
		logger.info("Updating RawMaterials in DB");
		if(r.getLocation()==null || r.getId()==0 || r.getName()==null || r.getPrice()==0) {
		throw new PurchaseDepartmentException("All fields should be updated or should not be empty");
		}
		return rs.updateRaw(r);
	}

	/** Deleting the RawMaterials Object
	 * @param id
	 * @return String
	 */
	@DeleteMapping("/delete/{id}")
	public String deleteRaw(@PathVariable int id) {
		if (id!=0) {
			logger.info("Deleting RawMaterials to DB");
			rs.deleteRaw(id);
		}
		else
			throw new PurchaseDepartmentException("Id should not be empty");
		return "Deleted Successfully";
	}

	/*
	 * @GetMapping("/getCategories") public List<Category> getAllCategory() { return
	 * client.getAllCategory(); }
	 */
}
