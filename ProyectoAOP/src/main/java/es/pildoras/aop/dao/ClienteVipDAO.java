package es.pildoras.aop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class ClienteVipDAO{


	public void insertarClientes() {

		System.out.print("Se ha insertado");
		
	}

	
}
