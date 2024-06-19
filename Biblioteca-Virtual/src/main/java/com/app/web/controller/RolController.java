package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Rol;
import com.app.web.service.RolService;

@Controller
public class RolController {
	
	@Autowired
	private RolService service;
	
	@GetMapping("/roles")
	public String listarRoles(Model model) {
		model.addAttribute("roles", service.listarRoles());
		return ""; // RUTAS DEL THYMELEAF
	}
	
	@GetMapping("roles/nuevo")
	public String mostrarFormNuevo(Model model) {
		Rol rol = new Rol();
		model.addAttribute("rol", rol);
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/roles") 
	public String guardarRoles(@ModelAttribute("rol") Rol rol) {
		service.guardarRol(rol);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/roles/editar/{id}")
	public String mostrarFormActualizar(@PathVariable Integer id, Model model) {
		model.addAttribute("rol", service.obtenerRolId(id));
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/roles/{id}")
	public String actualizarRol(@PathVariable Integer id, @ModelAttribute("rol") Rol rol, Model model) {
		Rol rolE = service.obtenerRolId(id);
		rolE.setRol_id(rol.getRol_id());
		rolE.setNombre(rol.getNombre());
		rolE.setFecha_creacion(rol.getFecha_creacion());
		service.actualizarRol(rolE);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/roles/{id}")
	public String eliminarRol(@PathVariable Integer id) {
		service.eliminarRol(id);
		return ""; // RUTAS DEL THYMELEAF
	}

}
