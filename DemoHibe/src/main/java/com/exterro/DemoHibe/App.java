package com.exterro.DemoHibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    { try {
    	
    
    	Alien obj=new Alien();
    	obj.setAid1(12);
    	obj.setColor("Green");
    	obj.setName("Nivi");
    	
    	Configuration con=new Configuration ().configure().addAnnotatedClass(Alien.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(obj);
    	tx.commit();
    }
    catch(Exception e) {
    	
    }
}}
