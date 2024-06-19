package com.app.web.service;

import java.util.List;

import com.app.web.entity.Rol;

public interface RolService {

	public List<Rol> listarRoles();
	public Rol guardarRol(Rol rol);
	public Rol obtenerRolId(Integer id);
	public Rol actualizarRol(Rol rol);
	public void eliminarRol(Integer id);
	
}
