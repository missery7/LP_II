package com.app.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero {

	@Id
	private int genero_id;
	
	@Column(name = "nombre", nullable = false, length = 25, unique = true)
	private String nombre;
	
	@Column(name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime fecha_creacion;

	public Genero() {
	}

	public Genero(int genero_id, String nombre, LocalDateTime fecha_creacion) {
		this.genero_id = genero_id;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}

	public Genero(String nombre, LocalDateTime fecha_creacion) {
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}

	public int getGenero_id() {
		return genero_id;
	}

	public void setGenero_id(int genero_id) {
		this.genero_id = genero_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDateTime fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
}
