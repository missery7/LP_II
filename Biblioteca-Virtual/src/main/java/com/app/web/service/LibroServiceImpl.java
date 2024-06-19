package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Libro;
import com.app.web.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repositorio;

	@Override
	public List<Libro> listarLibros() {
		return repositorio.findAll();
	}

	@Override
	public Libro guardarLibro(Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public Libro obtenerLibroId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Libro actualizarLibro(Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public void eliminarLibro(Integer id) {
		repositorio.deleteById(id);

	}
}
