package com.app.web.service;

import java.util.List;

import com.app.web.entity.Genero;

public interface GeneroService {

	public List<Genero> listarGeneros();
	public Genero guardarGeneros(Genero genero);
	public Genero obtenerGeneroId(Integer id);
	public Genero actualizarGenero(Genero genero);
	public void eliminarGenero(Integer id);
	
}
