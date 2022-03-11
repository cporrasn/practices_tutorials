package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PruebasJDBCEliminarClientes {

	public static void main(String[] args) {
		
		SessionFactory miFactory =new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(Detalles_Cliente.class).
				buildSessionFactory();
		Session misession=miFactory.openSession();
		
		
		try {
			
				
			misession.beginTransaction();
			Cliente cliente=misession.get(Cliente.class, 1);
			if(cliente!=null)
				misession.delete(cliente);
			
			misession.getTransaction().commit();
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			misession.close();
			miFactory.close(); 
		}

	}

}
