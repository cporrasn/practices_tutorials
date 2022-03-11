package es.pildoras.pruebasHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {
		SessionFactory miFactory =new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				buildSessionFactory();
		Session misession=miFactory.openSession();
		try{
			misession.beginTransaction();
			List<Cliente> clientes=misession.createQuery("from Cliente").getResultList();
			for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
				Cliente cliente = (Cliente) iterator.next();
				System.out.println(cliente.getNombre());
			}
			
			List<Cliente> clientes1=misession.createQuery("from Cliente cl where cl.nombre='Ana'").getResultList();
			for (Iterator iterator = clientes1.iterator(); iterator.hasNext();) {
				Cliente cliente = (Cliente) iterator.next();
				cliente.setNombre("jejejejej");
			}
			misession.getTransaction().commit();
		}finally {
			misession.close();
			miFactory.close(); 
		}

	}

}
