package com.app.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "editoriales")
public class Editorial {
	
	@Id
	private int editorial_id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fecha_creacion;
	
	public Editorial() {
		
	}
	
	public Editorial(int editorial_id, String nombre, LocalDateTime fecha_creacion) {
		this.editorial_id = editorial_id;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}
	
	public Editorial(String nombre, LocalDateTime fecha_creacion) {
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}

	public int getEditorial_id() {
		return editorial_id;
	}

	public void setEditorial_id(int editorial_id) {
		this.editorial_id = editorial_id;
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

	@Override
	public String toString() {
		return "Editorial [editorial_id=" + editorial_id + ", nombre=" + nombre + ", fecha_creacion=" + fecha_creacion
				+ "]";
	}

}
