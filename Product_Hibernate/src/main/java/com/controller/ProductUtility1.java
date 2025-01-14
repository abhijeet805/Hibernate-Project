package com.controller;

import java.util.List;
import java.util.Scanner;

import com.entity.Product;
import com.service.ProductService;
import com.utillity.ProductUtility;

public class ProductUtility1 {
  public static void main(String[] args) {
  
	  boolean wantToTerminate=false;
	  ProductService productService = new ProductService();
		int ch;
		String msg = null;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice:\n1-Add Product \n2-Display Specific Product \n3-Delete Product \n4-Update Product"
					+ "\n5-Get All Product Press 0 For Terminate"
					+"\n6-All Product By ASC/DESC Order sby Given Parameter (ColumnName)");
			ch = sc.nextInt();

			int ProductId;
			switch (ch) {
			case 1:{ 

				Product product = ProductUtility.prepareProductData();
				msg = productService.addProduct(product);
				System.out.println(msg);
				break;
			}
			

			case 2:{
				 ProductId = ProductUtility.acceptIdBtUser();
				Product ob = (Product) productService.getProductById(ProductId);
//				System.out.println(ob.getProductId());
//				System.out.println(ob.getProductName());
//				System.out.println(ob.getProductPrice());
//				System.out.println(ob.getProductQty());
//				System.out.println(ob.getMfgDate());
//				System.out.println(ob.getExpDate());
				
				System.out.println(ob);
				break;
			}
			case 3:{
				
				 ProductId = ProductUtility.acceptIdBtUser();
				 msg= productService.deleteProductById(ProductId);
				   System.out.println(msg);
				break;
			}
			case 4:{
				Product product = ProductUtility.prepareProductData();
//				ProductId = ProductUtility.acceptIdBtUser();
//				product.setProductId(ProductId);
				 msg= productService.updateProduct(product);
				 System.out.println(msg); 
				break;
			}
			case 5:{
				List<Product> allProduct = productService.getAllProduct();
				
				for (Product product2 : allProduct) {
//					System.out.println(product2.getProductId());
//					System.out.println(product2.getProductName());
//					System.out.println(product2.getProductPrice());
//					System.out.println(product2.getProductQty());
//					System.out.println(product2.getMfgDate());
//					System.out.println(product2.getExpDate());
					
					System.out.println(product2);
			       }
				break;
				}
			
			case 6:{
				 System.out.println("Enter Parameter Name:");
				 String parameterName=sc.next();
				 List <Product> allProduct = productService.orderProductByParameter(parameterName);
				 for (Product product2 : allProduct) {
						System.out.println(product2.getProductId());
						System.out.println(product2.getProductName());
						System.out.println(product2.getProductPrice());
						System.out.println(product2.getProductQty());
						System.out.println(product2.getMfgDate());
						System.out.println(product2.getExpDate());
				       }
				break;}
			case 0:{
				   wantToTerminate =true;
				break;
			}
			}

		} while (wantToTerminate);
  }



}

//shift + ctrl + o for automatically Imported