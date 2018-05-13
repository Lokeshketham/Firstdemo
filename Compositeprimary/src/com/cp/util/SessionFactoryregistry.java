package com.cp.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryregistry {
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionfactory() {
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionfactory=configuration.buildSessionFactory(registry);
		return sessionfactory;
	}
	public static void close(){
		sessionfactory.close();
		
	}


}
