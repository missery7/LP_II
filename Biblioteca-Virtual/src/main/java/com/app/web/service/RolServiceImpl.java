package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Rol;
import com.app.web.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	private RolRepository repositorio;
	
	@Override
	public List<Rol> listarRoles() {
		return repositorio.findAll();
	}

	@Override
	public Rol guardarRol(Rol rol) {
		return repositorio.save(rol);
	}

	@Override
	public Rol obtenerRolId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Rol actualizarRol(Rol rol) {
		return repositorio.save(rol);
	}

	@Override
	public void eliminarRol(Integer id) {
		repositorio.deleteById(id);
	}

}
