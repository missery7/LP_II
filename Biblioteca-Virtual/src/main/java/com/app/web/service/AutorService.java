package com.app.web.service;

import java.util.List;

import com.app.web.entity.Autor;

public interface AutorService {
	
	public List<Autor> listarAutores();
	public Autor guardarAutor(Autor autor);
	public Autor obtenerAutorId(Integer id);
	public Autor actualizarAutor(Autor autor);
	public void eliminarAutor(Integer id);

}
