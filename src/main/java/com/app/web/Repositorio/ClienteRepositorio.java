package com.app.web.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

	
}
