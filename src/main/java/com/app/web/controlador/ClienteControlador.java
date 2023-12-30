package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.web.entidad.Cliente;
import com.app.web.servicio.ClienteServicio;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping

public class ClienteControlador {
	@Autowired
	private ClienteServicio servicio;

	@GetMapping({ "/clientes", "/" })

	public String listarClientes(Model model) {

		model.addAttribute("clientes", servicio.listarClientes());
		return "clientes"; // retorna archivo clientes.html
	}

	@GetMapping("/clientes/agregar")
	public String mostrarFormularioAgregarCliente(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);

		return "agregar_clientes";

	}

	@PostMapping("/clientes")
	public String GuararCliente(@ModelAttribute("cliente") Cliente cliente) {
		servicio.guardarCliente(cliente);
		return "redirect:/clientes";
	}

	@GetMapping("/clientes/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
		model.addAttribute("cliente", servicio.obtenerClienteID(id));
		return "editar_clientes";
	}

	@PostMapping("/clientes/{id}")
	public String actualizarCliente(@PathVariable Long id, @ModelAttribute("cliente") Cliente cliente, Model model) {
		Cliente cteExiste = servicio.obtenerClienteID(id);
		cteExiste.setId(id);
		cteExiste.setNombre(cliente.getNombre());
		cteExiste.setTelefono(cliente.getTelefono());
		cteExiste.setCorreo(cliente.getCorreo());
		servicio.actualizarCliente(cteExiste);
		return "redirect:/clientes";
	}

	@GetMapping("/clientes/{id}")
	public String eliminarCliente(@PathVariable Long id) {
		servicio.eliminarCliente(id);
		return "redirect:/clientes";
	}
}
