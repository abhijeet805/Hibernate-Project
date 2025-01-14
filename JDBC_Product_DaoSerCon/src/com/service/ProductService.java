package com.service;

import java.text.SimpleDateFormat;

import com.dao.ProductDao;
import com.model.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();

	public String addProduct(Product product) {
//		String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
//		System.out.println(  productId);
//		product.setProductId(Integer.parseInt(productId));

		
		String msg = productDao.addProduct(product);
		return msg;

	}

	public String deleteProductById(long productId) {
		return null;

	}

	public Object getProductById(long productId) {
		Product ob = (Product) productDao.getProductById(productId);
		return ob;

	}

	public String updateProduct(Product product) {
		return null;

	}

	public Object retriveAllProduct() {
		return null;

	}

	public Object retriveAscendingOrder(Product product) {
		return product;

	}

	public Object retriveproductByName(String pname) {
		return pname;

	}

	public Object retriveProductByPrice(long price) {
		return price;

	}

	public Object retriveProductByPattern(long NamePattern) {
		return null;

	}

	public Object retriveProductByPriceRange(long price) {
		return price;

	}

	public Object retriveMaximumProductByPrice(String Name) {
		return null;

	}
}
