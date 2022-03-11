package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {
//si s ele pone * en el tipo de dato te coge todos los metodos sin importar el tipo de retorno
	//si ponemos.. en la parte d elos parametros, el aspecto trabaja no importa si tienen o no parametros
	@Before("execution(public String insertarClientes())")
	public void antesInsertarCliente() {
		System.out.println("el usuario esta logeado");
	}
}
