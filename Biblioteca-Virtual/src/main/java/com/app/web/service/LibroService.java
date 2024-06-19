package com.app.web.service;

import java.util.List;

import com.app.web.entity.Libro;

public interface LibroService {
	
	public List<Libro> listarLibros();
	public Libro guardarLibro(Libro libro);
	public Libro obtenerLibroId(Integer id);
	public Libro actualizarLibro(Libro libro);
	public void eliminarLibro(Integer id);

}
