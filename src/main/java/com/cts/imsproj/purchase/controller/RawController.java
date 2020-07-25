package com.cts.imsproj.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.imsproj.purchase.DAO.CategoryClient;
import com.cts.imsproj.purchase.entity.Category;
import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.service.RawService;
@RestController
@RequestMapping("/api")
public class RawController {
	
	@Autowired
	RawService rs;
	
	@Autowired
	CategoryClient client;

	@GetMapping("/getall")
	public List<RawMaterials> getAll() {

		List<RawMaterials> l = rs.getAll();

		return l;
	}

	@PostMapping("/add")
	public RawMaterials addRawMaterials(@RequestBody RawMaterials r) {
		RawMaterials rm = rs.addRaw(r);
		return rm;
	}

	@PutMapping("/update")
	public RawMaterials updateRawMaterials(@RequestBody RawMaterials r) {

		RawMaterials rm = rs.updateRaw(r);

		return rm;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteRaw(@PathVariable int id) {

		rs.deleteRaw(id);

		return "Deleted Successfully";
	}
	
	@GetMapping("/getCategories")
	public List<Category> getAllCategory(){
		List<Category> list = client.getAllCategory();
		return list;
	}

}
