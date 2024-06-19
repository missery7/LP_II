package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Autor;
import com.app.web.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository repositorio;
	
	@Override
	public List<Autor> listarAutores() {
		return repositorio.findAll();
	}

	@Override
	public Autor guardarAutor(Autor autor) {
		return repositorio.save(autor);
	}

	@Override
	public Autor obtenerAutorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Autor actualizarAutor(Autor autor) {
		return repositorio.save(autor);
	}

	@Override
	public void eliminarAutor(Integer id) {
		repositorio.deleteById(id);
		
	}

}
