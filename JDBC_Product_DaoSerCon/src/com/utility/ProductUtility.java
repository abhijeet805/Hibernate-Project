package com.utility;

import java.util.Scanner;

import com.model.Product;

public class ProductUtility {
	
	  public static Product prepareProductData() {
		
		  Scanner scanner=new Scanner(System.in);
		   
    	  System.out.println("Enter Product Id");
    	  int productId=scanner.nextInt();
    	  
    	  System.out.println("Enter Product Name");
    	  String productName=scanner.next();
    	  
    	  System.out.println("Enter Product Qty");
    	  int productQty=scanner.nextInt();
    	  
    	  System.out.println("Enter Product Price");
    	  double productPrice=scanner.nextDouble();
    	  
    	  System.out.println("Enter Product MFG");
    	  String productMfg=scanner.next();
    	  
    	  System.out.println("Enter Product Exp");
    	  String productExp=scanner.next();
    	  
    	  Product product=new Product(productId, productName, productQty, productPrice, productMfg, productExp);
    	 
    	  return product;
    	 
     }
	  
	  public static int acceptIdBtUser() {
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter Product Id for Display Product");
    	  int productId=sc.nextInt();
		  return productId;
	  }
}
