package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.Repositorio.ClienteRepositorio;
import com.app.web.entidad.Cliente;

@SpringBootApplication
public class CrudSpringBootApplication {

	public static void main(String[] args) {	
		SpringApplication.run(CrudSpringBootApplication.class, args);

	}

//	@Autowired
//	private ClienteRepositorio repositorio;
//	@Override
//	public void run(String... args) throws Exception {
////		Cliente cte1 = new Cliente("toñito", "627183122", "toñito@gmail.com");
////		repositorio.save(cte1);
////		Cliente cte2 = new Cliente("antonio", "677863122", "antonio@gmail.com");
////		repositorio.save(cte2);
////		
//	}

}
