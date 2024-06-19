package com.app.web.service;

import java.util.List;

import com.app.web.entity.Editorial;

public interface EditorialService {

	public List<Editorial> listarEditoriales();
	public Editorial guardarEditorial(Editorial editorial);
	public Editorial obtenerEditorialId(Integer id);
	public Editorial actualizarEdirtorial(Editorial editorial);
	public void eliminarEditorial(Integer id);
	
}
