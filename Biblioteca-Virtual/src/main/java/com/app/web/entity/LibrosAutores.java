package com.app.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros_autores")
public class LibrosAutores {
	/*
	//@JoinColumn()
	private Libro libro_id;
	private Autor autor_id;
	*/
	@Column(name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime fecha_creacion;
	
}
