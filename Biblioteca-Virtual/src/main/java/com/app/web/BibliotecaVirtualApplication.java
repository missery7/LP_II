package com.app.web;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entity.Autor;
import com.app.web.entity.Editorial;
import com.app.web.entity.Libro;
import com.app.web.entity.Rol;
import com.app.web.repository.AutorRepository;
import com.app.web.repository.LibroRepository;
import com.app.web.repository.RolRepository;

@SpringBootApplication
public class BibliotecaVirtualApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaVirtualApplication.class, args);
	}

	//---------------------------------------------------------------- PRUEBAS ---------------------------------------------------------------------
	
	@Autowired
	//private LibroRepository repositorio;
	//private AutorRepository repositorio;
	//private RolRepository repositorio;
	
	LocalDateTime local = LocalDateTime.now();
	@Override
	public void run(String... args) throws Exception {
		/*
		Editorial editorial = new Editorial();
		editorial.setEditorial_id(1);
		
		Libro libro1 = new Libro(
				"Los 3 mosqueteros", 
				"Historia de 3 amigos que van por el mundo de aventuras", 
				editorial, 
				local, 
				220, 
				"", 
				4.0, 
				local);
		repositorio.save(libro1);
		Libro libro12= new Libro(
				"Los 3 cerditos", 
				"Historia de 3 cerditos que construyen cada uno su casa, pero el lobo los empieza a cazar", 
				editorial, 
				local, 
				280, 
				"", 
				3.0, 
				local);
		repositorio.save(libro12);
		
		Autor autor = new Autor("Wilder Anderson Villachica Rafael", local);
		repositorio.save(autor);
		Autor autor2 = new Autor("Sofia Vergara Salvatierra Alverte", local);
		repositorio.save(autor2);
		
		Rol rol1 = new Rol("Administrador", local);
		repositorio.save(rol1);
		
		Rol rol2 = new Rol("Gerente", local);
		repositorio.save(rol2);
		*/
		
	}

}
