package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Genero;
import com.app.web.repository.GeneroRepository;

@Service
public class GeneroServiceImpl implements GeneroService{

	@Autowired
	private GeneroRepository repositorio;
	
	@Override
	public List<Genero> listarGeneros() {
		return repositorio.findAll();
	}

	@Override
	public Genero guardarGeneros(Genero genero) {
		return repositorio.save(genero);
	}

	@Override
	public Genero obtenerGeneroId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Genero actualizarGenero(Genero genero) {
		return repositorio.save(genero);
	}

	@Override
	public void eliminarGenero(Integer id) {
		repositorio.deleteById(id);
	}

}
