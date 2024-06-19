package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Genero;
import com.app.web.service.GeneroService;

@Controller
public class GeneroController {

	@Autowired
	private GeneroService service;
	
	@GetMapping("/generos")
	public String listarGeneros(Model model) {
		model.addAttribute("generos", service.listarGeneros());
		return ""; // RUTAS DEL THYMELEAF
	}
	
	@GetMapping("generos/nuevo") 
	public String mostrarFormNuevo(Model model) {
		Genero genero = new Genero();
		model.addAttribute("genero", genero);
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/generos") 
	public String guardarGeneros(@ModelAttribute("genero") Genero genero) {
		service.guardarGeneros(genero);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/generos/editar/{id}")
	public String mostrarFormActualizar(@PathVariable Integer id, Model model) {
		model.addAttribute("genero", service.obtenerGeneroId(id));
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/generos/{id}")
	public String actualizarGenero(@PathVariable Integer id, @ModelAttribute("genero") Genero genero, Model model) {
		Genero generoE = service.obtenerGeneroId(id);
		generoE.setGenero_id(genero.getGenero_id());
		generoE.setNombre(genero.getNombre());
		generoE.setFecha_creacion(genero.getFecha_creacion());
		service.actualizarGenero(generoE);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/generos/{id}")
	public String eliminarGenero(@PathVariable Integer id) {
		service.eliminarGenero(id);
		return ""; // RUTAS DEL THYMELEAF
	}
	
}
