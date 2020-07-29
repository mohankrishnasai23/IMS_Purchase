package com.cts.imsproj.purchase.dto;

import java.io.Serializable;
/**
 * The DTO class for Supplier .
 * 
 */
public class SupplierDto implements Serializable{

		private static final long serialVersionUID = 1L;

		private int supplierId;

		private String supplierCompany;

		private int supplierContact;

		private String supplierName;
		
		private int qnty;

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

		public int getQnty() {
			return qnty;
		}

		public void setQnty(int qnty) {
			this.qnty = qnty;
		}

	}

