package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.hibernate.SharedSessionContract;
import org.hibernate.criterion.Order;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Session;

import com.config.hibernateConfig;
import com.entity.Product;


public class ProductDao {

	SessionFactory sf = hibernateConfig.getSessionFactory();

	public String addProduct(Product product) {

		org.hibernate.Session session = sf.openSession();
		session.save(product);
		session.beginTransaction().commit();

		return "Added Succesfully";

	}

	public String deleteProductById(int productId) {
		Session session = sf.openSession();

		Product product = session.get(Product.class, productId); // persistent object
		session.delete(product);
		session.beginTransaction().commit();

		return "delete Succesfully";

	}

	public Object getProductById(int productId) {
		Session session = sf.openSession();
		Product product = session.get(Product.class, productId);

		return product;

	}

	public String updateProduct(Product product) {
		Session session = sf.openSession();
		session.update(product);
		session.beginTransaction().commit();
		return "Updated";

	}

	public List<Product> getAllProduct() {
		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(Product.class);
		List<Product> list = criteria.list();
		return list;
	}

	public List<Product> orderProductByParameter(String parameterName) {
		Session session = sf.openSession();

		Criteria criteria =  session.createCriteria(Product.class);
		
		//criteria.addOrder(Order.asc(parameterName));
		criteria.addOrder(Order.desc(parameterName));
		List<Product> list = criteria.list();
		
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
