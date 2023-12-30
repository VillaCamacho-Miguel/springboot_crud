package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.Repositorio.ClienteRepositorio;
import com.app.web.entidad.Cliente;



@Service
public class ClienteServicioImp implements ClienteServicio {

	@Autowired
	private ClienteRepositorio repositorio;
	@Override
	public List<Cliente> listarClientes() {
		
		return repositorio.findAll();
	}
	@Override
	public Cliente guardarCliente(Cliente cte) {
		return repositorio.save(cte);
	}
	@Override
	public Cliente obtenerClienteID(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}
	@Override
	public Cliente actualizarCliente(Cliente cte) {
		// TODO Auto-generated method stub
		return repositorio.save(cte);
	}
	@Override
	public void eliminarCliente(Long id) {
		repositorio.deleteById(id);
	}

}
