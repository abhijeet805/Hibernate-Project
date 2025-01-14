package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Player;

public class hibernateConfig {
        public static SessionFactory getSessionFactory() {
        	Configuration cfg=new Configuration();
        	cfg.configure().addAnnotatedClass(Player.class);
        	
        	SessionFactory sf=cfg.buildSessionFactory();
        	
        	return sf;
        }
}
