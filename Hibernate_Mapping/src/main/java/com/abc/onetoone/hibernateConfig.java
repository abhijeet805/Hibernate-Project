package com.abc.onetoone;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateConfig {
        public static SessionFactory getSessionFactory() {
        	Configuration cfg=new Configuration();
        	cfg.configure().addAnnotatedClass(Player.class).addAnnotatedClass(Address.class);
        	
        	SessionFactory sf=cfg.buildSessionFactory();
        	
        	return sf;
        }
}
