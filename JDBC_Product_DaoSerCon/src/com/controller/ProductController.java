package com.controller;

import java.sql.Connection;
import java.util.Scanner;

import com.config.DBConnection;
import com.model.Product;
import com.service.ProductService;
import com.utility.ProductUtility;

public class ProductController {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		int ch;
		String msg = null;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice:1-Add Product 2-Display Specific Product");
			ch = sc.nextInt();

			switch (ch) {
			case 1: {

				Product product = ProductUtility.prepareProductData();
				msg = productService.addProduct(product);
				System.out.println(msg);
				break;

			}

			case 2:
				long ProductId = ProductUtility.acceptIdBtUser();
				Product ob = (Product) productService.getProductById(ProductId);
				System.out.println(ob.getProductId());
				System.out.println(ob.getProductName());
				System.out.println(ob.getProductPrice());
				System.out.println(ob.getProductQty());
				System.out.println(ob.getMfgDate());
				System.out.println(ob.getExpDate());
				
				
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		} while (ch < 3);

	}
}
