package com.shubhu.DemoHibernate;

import java.util.List;
import java.util.Map;
import java.util.Random;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {    	
//    	Laptop l=new Laptop();
//    	l.setId(102);
//    	l.setCompany("dell");
//    	
//    	empName en=new empName();
//    	en.setFname("john");
//    	en.setMname("bhimrao");
//    	en.setLname("singh");
//    	
//    	emp e=new emp();
//    	e.setId(3);
//    	e.setName(en);
//    	e.getLaptop().add(l);
    	
    	Student sss=new Student();
    	sss.setRoll_no(69);
    	sss.setName("shubhzz");
    	sss.setMarks(99);
    	
    	Configuration c1c=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	org.hibernate.service.ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(c1c.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf=c1c.buildSessionFactory(reg);
    
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
   
    	s.save(sss);
    	sss.setMarks(45);
    	tx.commit();
        s.close();
        sss.setMarks(88);
    	
    	
//    	Query q1=s.createQuery("select sum(marks) from Student where marks>:b");
//    	q1.setParameter("b", b);
    	
//    	SQLQuery q1=s.createSQLQuery("select roll_no,name from Student");
//    	q1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//    	q1.addEntity(Student.class);
//    	List<Student> std=q1.list();
//    	for(Object o:std)
//    	{
//    		Map m=(Map)o;
//    	System.out.println(m.get("roll_no")+":"+m.get("name"));
//    	}
//    	for(Object[] ss:st)
//    	{
//    	System.out.println(ss[0]+":"+ss[1]);
//    	}
//		s.close();
    	
//    	e=(emp)s.get(emp.class,3);
//		System.out.println(e);
//    	s.save(l);
//    	s.save(e);    	
    }
}
