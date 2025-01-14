package com.service;

import java.text.SimpleDateFormat;
import java.util.List;

import com.dao.ProductDao;
import com.entity.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();
	public String addProduct(Product product) {
		 
//		String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
//		System.out.println(  productId);
//		int a=Integer.parseInt(productId);
//		product.setProductId(a);
		
		String msg = productDao.addProduct(product);
		return msg;

	}

	public String deleteProductById(int productId) {
		String msg =productDao.deleteProductById(productId);
		return msg;

	}

	public Object getProductById(int productId) {
		Product ob = (Product) productDao.getProductById(productId);
		return ob;

	}

	public String updateProduct(Product product) {
		
		String msg = productDao.updateProduct(product);
		return msg;

	}

	public List<Product> getAllProduct() {
		List<Product> list = productDao.getAllProduct();
		
		return list;
	}

	public List<Product> orderProductByParameter(String parameterName) {
        List<Product> list = productDao.orderProductByParameter(parameterName);
		
		return list;
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
