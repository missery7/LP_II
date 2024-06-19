package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Autor;
import com.app.web.service.AutorService;

@Controller
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping("/autores")
	public String listarAutores(Model model) {
		model.addAttribute("autores", service.listarAutores());
		return ""; // RUTAS DEL THYMELEAF
	}
	
	@GetMapping("autores/nuevo") 
	public String mostrarFormNuevo(Model model) {
		Autor autor = new Autor();
		model.addAttribute("autor", autor);
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/autores") 
	public String guardarAutores(@ModelAttribute("autor") Autor autor) {
		service.guardarAutor(autor);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/autores/editar/{id}")
	public String mostrarFormActualizar(@PathVariable Integer id, Model model) {
		model.addAttribute("autor", service.obtenerAutorId(id));
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/autores/{id}")
	public String actualizarAutor(@PathVariable Integer id, @ModelAttribute("autor") Autor autor, Model model) {
		Autor autorE = service.obtenerAutorId(id);
		autorE.setAutor_id(autor.getAutor_id());
		autorE.setNombre_completo(autor.getNombre_completo());
		autorE.setFecha_creacion(autor.getFecha_creacion());
		service.actualizarAutor(autorE);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/autores/{id}")
	public String eliminarAutor(@PathVariable Integer id) {
		service.eliminarAutor(id);
		return ""; // RUTAS DEL THYMELEAF
	}

}
