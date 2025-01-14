package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.config.DBConnection;
import com.model.Product;

public class ProductDao {

	public String addProduct(Product product) {
		String msg = null;
		try {

			Connection con = DBConnection.getConnection();// shortcut= alt + shift + L for the give return Type

			String sqlQuery = "INSERT INTO product(productid,product_name,product_qty,product_price,mfg_date,exp_date) VALUES (?,?,?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(sqlQuery);
			pst.setInt(1, product.getProductId());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getProductQty());
			pst.setDouble(4, product.getProductPrice());
			pst.setString(5, product.getMfgDate());
			pst.setString(6, product.getExpDate());

			int rowaffected = pst.executeUpdate();

			if (rowaffected > 0) {
				msg = "Added Succesfully";
			} else {

			}

		} catch (SQLIntegrityConstraintViolationException e) {
			msg = "Data Already Exists";
			// e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			msg = "Sql Exception Occur";
		}

		catch (Exception e) {
			// TODO: handle exception
			msg = "SomeThing went Wrong";
		}
		return msg;

	}

	public String deleteProductById(long productId) {
		return null;

	}

	public Object getProductById(long productId) {
		
		
		

		try {

			Connection con = DBConnection.getConnection();
			String sqlQuery = "select * from product where productid=?";

			PreparedStatement pst = con.prepareStatement(sqlQuery);
			pst.setDouble(1, productId);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				int Id = rs.getInt(1);
				String Name = rs.getString(2);
				int Qty = rs.getInt(3);
				Double price = rs.getDouble(4);
				String MFG = rs.getString(5);
				String EXP = rs.getString(6);

			Product	product = new Product(Id, Name, Qty, price, MFG, EXP);
				return product;
			}

			else {
				return "Product Not Found"+productId;

			}

		} catch (Exception e) {
			e.printStackTrace();
			return "Something Went Wrong";
		}

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
