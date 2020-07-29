package com.cts.imsproj.purchase.dto;

import java.io.Serializable;

import com.cts.imsproj.purchase.entity.Supplier;

/**
 * The DTO class for RawMaterials .
 * 
 */
public class RawMaterialsDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String location;
	private double price;
	private Supplier supplier;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}
