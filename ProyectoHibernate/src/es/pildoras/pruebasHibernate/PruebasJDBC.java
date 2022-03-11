package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PruebasJDBC {

	public static void main(String[] args) {
		
		
		SessionFactory miFactory =new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(Detalles_Cliente.class).
				buildSessionFactory();
		Session misession=miFactory.openSession();
		
		
	//	String directionDB="jdbc:mysql://localhost/pruebasHibernate?useSSL=false";
	//	String usuario="root";
	//	String pass="";
		try {
			Cliente cliente=new Cliente("Rosa", "Porras Nodarse", "Escobar");
			Detalles_Cliente dcliente=new Detalles_Cliente("http", "7766555", "Oye sí");
			cliente.setDetalles_cliente(dcliente);
			
			misession.beginTransaction();
			misession.save(cliente);
			misession.getTransaction().commit();
				
			
			//System.out.println("Conectando "+directionDB);
			//Connection miConexion=DriverManager.getConnection(directionDB,usuario,pass);
			//System.out.println("Conecta");
			
			//lectura de registro
			
			//misession.beginTransaction();
			//Cliente clienteInsertado=misession.get(Cliente.class, 4);
			//misession.getTransaction().commit();
			//System.out.println(clienteInsertado.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			misession.close();
			miFactory.close(); 
		}

	}

}
