package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //tell to the ORM
@Table(name = "product")
public class Product {

	

	@Id
	@Column(name = "productId", unique = true ,nullable= false)
	
	private int productId;
	
	@Column(name="productName" ,unique = true, nullable=false)
	private String productName;
	
	@Column(name="productQty" , nullable=false)
	private int productQty;
	
	@Column(name="productPrice" , nullable=false)
	private double productPrice;
	
	@Column(name="mfgDate" , nullable=false)
	private String mfgDate;
	
	@Column(name="expDate" ,nullable=false)
	private String expDate;

	public int getProductId() {
		return productId;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	public Product(int productId, String productName, int productQty, double productPrice, String mfgDate,
			String expDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate + "]";
	}

	
	

}
