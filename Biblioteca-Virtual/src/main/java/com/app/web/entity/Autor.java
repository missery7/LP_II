package com.app.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {

	@Id
	private int autor_id;

	@Column(name = "nombre_completo", nullable = false, length = 75)
	private String nombre_completo;

	@Column(name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime fecha_creacion;

	public Autor() {
	}

	public Autor(int autor_id, String nombre_completo, LocalDateTime fecha_creacion) {
		this.autor_id = autor_id;
		this.nombre_completo = nombre_completo;
		this.fecha_creacion = fecha_creacion;
	}

	public Autor(String nombre_completo, LocalDateTime fecha_creacion) {
		this.nombre_completo = nombre_completo;
		this.fecha_creacion = fecha_creacion;
	}

	public int getAutor_id() {
		return autor_id;
	}

	public void setAutor_id(int autor_id) {
		this.autor_id = autor_id;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public LocalDateTime getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDateTime fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

}
