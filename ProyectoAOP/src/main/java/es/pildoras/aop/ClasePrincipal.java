package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.dao.ClienteDAO;
import es.pildoras.aop.dao.ClienteVipDAO;

public class ClasePrincipal {

	public static void main(String[] args) {

		//leer la configuracion
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(Configuracion.class);
		
		//obtener el bean del contenedor de spring
		
		ClienteDAO miCliente=contexto.getBean("clienteDAO",ClienteDAO.class);
		
		miCliente.insertarClientes();
		
		ClienteVipDAO miCliente1=contexto.getBean("clienteVipDAO",ClienteVipDAO.class);
		
		miCliente1.insertarClientes();
		//llamar al metodo
		
		contexto.close();
		
		//cerrar el contexto

	}

}
