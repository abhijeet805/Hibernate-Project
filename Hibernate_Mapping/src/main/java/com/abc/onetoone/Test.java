package com.abc.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
	
		SessionFactory sf=hibernateConfig.getSessionFactory();
		Session session =sf.openSession();
		
		Address address=new Address(1,"Ranchi","455253");
		
		Player player=new Player(101,"RohitSharma",7,6000,address);
		
		session.save(player);
		session.beginTransaction().commit();
		System.out.println("Done");
	}
}
