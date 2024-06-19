package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Editorial;
import com.app.web.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	private EditorialRepository repositorio;
	
	@Override
	public List<Editorial> listarEditoriales() {
		return repositorio.findAll();
	}

	@Override
	public Editorial guardarEditorial(Editorial editorial) {
		return repositorio.save(editorial);
	}

	@Override
	public Editorial obtenerEditorialId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Editorial actualizarEdirtorial(Editorial editorial) {
		return repositorio.save(editorial);
	}

	@Override
	public void eliminarEditorial(Integer id) {
		repositorio.deleteById(id);		
	}

}
