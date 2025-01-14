package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class hibernateConfig {
  public static SessionFactory getSessionFactory() {
	  
	  Configuration cfg=new Configuration();
	  cfg.configure().addAnnotatedClass(Product.class);
	  
	  SessionFactory sf= cfg.buildSessionFactory();
     return sf;
  }
}
