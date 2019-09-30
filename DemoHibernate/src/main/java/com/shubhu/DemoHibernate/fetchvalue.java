package com.shubhu.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class fetchvalue {

	public static void main(String[] args) {
		
		List<emp> ee=new ArrayList<>();
		emp e=null;
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(emp.class).addAnnotatedClass(Laptop.class);
		org.hibernate.service.ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf=cfg.buildSessionFactory(reg);
		
		Session s=sf.openSession();
		s.beginTransaction();
	
		Query q1=s.createQuery("from emp");
		q1.setCacheable(true);
		e=(emp)q1.uniqueResult();
		
		
//		Session s1=sf.openSession();
//		s1.beginTransaction();
//		Query q2=s1.createQuery("from emp");
//		q2.setCacheable(true);
//		e=(emp)q2.uniqueResult();
//		System.out.println(e);
//		s1.getTransaction().commit();
//		s1.close();
	}

}
