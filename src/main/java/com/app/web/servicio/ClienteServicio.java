package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Cliente;

public interface ClienteServicio {

	public List<Cliente> listarClientes();
	
	public Cliente guardarCliente(Cliente cte);
	
	public Cliente obtenerClienteID(Long id);
	
	public Cliente actualizarCliente(Cliente cte);
	
	public void eliminarCliente(Long id);
		
	
}
