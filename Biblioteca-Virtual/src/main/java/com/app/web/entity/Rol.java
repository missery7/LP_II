package com.app.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {
	
	@Id
	private int rol_id;
	
	@Column(name = "nombre", nullable = false, length = 75)
	private String nombre;
	
	@Column(name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime fecha_creacion;

	public Rol() {
	}

	public Rol(int rol_id, String nombre, LocalDateTime fecha_creacion) {
		this.rol_id = rol_id;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}

	public Rol(String nombre, LocalDateTime fecha_creacion) {
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}

	public int getRol_id() {
		return rol_id;
	}

	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
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
