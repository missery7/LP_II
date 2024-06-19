package com.app.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

	@Id
	private int libro_id;

	@Column(name = "titulo", nullable = false, length = 125)
	private String titulo;

	@Column(name = "sinopsis", nullable = false, columnDefinition = "TEXT")
	private String sinopsis;

	@ManyToOne
	@JoinColumn(name = "editorial_id", referencedColumnName = "editorial_id", nullable = false)
	private Editorial editorial_id;

	@Column(name = "fecha_lanzamiento", nullable = false)
	private LocalDateTime fecha_lanzamiento;

	@Column(name = "ejemplares", nullable = false)
	private int ejemplares;

	@Column(name = "url_imagen", nullable = false, length = 125)
	private String url_imagen;

	@Column(name = "valoracion", nullable = false, precision = 2)
	private double valoracion;

	@Column(name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime fecha_creacion;

	public Libro() {
	}

	public Libro(int libro_id, String titulo, String sinopsis, Editorial editorial_id, LocalDateTime fecha_lanzamiento,
			int ejemplares, String url_imagen, double valoracion, LocalDateTime fecha_creacion) {
		this.libro_id = libro_id;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.editorial_id = editorial_id;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.ejemplares = ejemplares;
		this.url_imagen = url_imagen;
		this.valoracion = valoracion;
		this.fecha_creacion = fecha_creacion;
	}

	public Libro(String titulo, String sinopsis, Editorial editorial_id, LocalDateTime fecha_lanzamiento,
			int ejemplares, String url_imagen, double valoracion, LocalDateTime fecha_creacion) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.editorial_id = editorial_id;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.ejemplares = ejemplares;
		this.url_imagen = url_imagen;
		this.valoracion = valoracion;
		this.fecha_creacion = fecha_creacion;
	}

	public int getLibro_id() {
		return libro_id;
	}

	public void setLibro_id(int libro_id) {
		this.libro_id = libro_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Editorial getEditorial_id() {
		return editorial_id;
	}

	public void setEditorial_id(Editorial editorial_id) {
		this.editorial_id = editorial_id;
	}

	public LocalDateTime getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}

	public void setFecha_lanzamiento(LocalDateTime fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public String getUrl_imagen() {
		return url_imagen;
	}

	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	public LocalDateTime getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDateTime fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

}
