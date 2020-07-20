package com.cts.imsproj.purchase.entity;


import java.io.Serializable;


/**
 * The persistent class for the product database table.
 * 
 */
//@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.AUTO)
	 */
	private int productId;

	private String productName;

	private double productsellingPrice;


	//bi-directional many-to-one association to Category
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="categoryId")
	 */
	private Category category;

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductsellingPrice() {
		return this.productsellingPrice;
	}

	public void setProductsellingPrice(double productsellingPrice) {
		this.productsellingPrice = productsellingPrice;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}