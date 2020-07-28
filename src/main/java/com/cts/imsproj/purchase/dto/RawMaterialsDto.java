package com.cts.imsproj.purchase.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.cts.imsproj.purchase.entity.Supplier;

/**
 * The DTO class for the RawMaterials .
 * 
 */
@Component
public class RawMaterialsDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String location;
	private double price;
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
}
