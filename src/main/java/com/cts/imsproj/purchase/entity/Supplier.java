package com.cts.imsproj.purchase.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * The persistent class for the supplier database table.
 * 
 */

@Entity(name = "supplier")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supplierId;

	private String supplierCompany;

	private int supplierContact;

	private String supplierName;

	public Supplier() {
	}

	public int getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierCompany() {
		return this.supplierCompany;
	}

	public void setSupplierCompany(String supplierCompany) {
		this.supplierCompany = supplierCompany;
	}

	public int getSupplierContact() {
		return this.supplierContact;
	}

	public void setSupplierContact(int supplierContact) {
		this.supplierContact = supplierContact;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}