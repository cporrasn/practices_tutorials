package pildoras.es.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pildoras.es.controlador.entity.Cliente;
import pildoras.es.dao.ClienteDAO;

@Controller
@RequestMapping("/cliente")
public class Controlador {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	@RequestMapping("/lista")
	public String listaCLientes(Model model) {
		
		//obtener los clientes desde el DAo
		
		List<Cliente> losCLientes=clienteDAO.getClientes();
		
		//agregar los clientes al modelo
		
		model.addAttribute("clientes",losCLientes);
		
		return "lista-clientes";
	}
	
	@RequestMapping("/muestraFormularioAgregar")
	public String muestraFormularioAgregar(Model model) {
		
		Cliente elCliente=new Cliente();
		model.addAttribute("cliente",elCliente);
		
		return "muestraFormularioAgregar";
	}
	
	@PostMapping("/insertarCliente")
	public String insertarCliente(@ModelAttribute("cliente") Cliente elCliente) {
		//insertar cliente en BDD
		clienteDAO.insertarClientes(elCliente);
		
		return "redirect:/cliente/lista";
	}
	
	@GetMapping("/muestraFormularioActualizar")
	public String muestraFormularioActualizar(@RequestParam("clienteId")int Id,Model elModelo) {
		
		//Obetebr el cliente cuyo id es el parametro
		
		Cliente elCLiente=clienteDAO.getCliente(Id);
		
		//Establecer el cliente como atributo
		
		elModelo.addAttribute("cliente",elCLiente);
		
		//Enviar al formulario
		
		return "muestraFormularioAgregar";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("clienteId")int Id) {
		
		//Obetebr el cliente cuyo id es el parametro
		
		clienteDAO.eliminarCliente(Id);
		
		//redireccionar
		return "redirect:/cliente/lista";
	}
}
