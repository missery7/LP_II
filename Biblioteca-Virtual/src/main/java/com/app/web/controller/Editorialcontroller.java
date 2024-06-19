package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Editorial;
import com.app.web.service.EditorialService;

@Controller
public class Editorialcontroller {
	
	@Autowired
	private EditorialService service;
	
	@GetMapping("/editoriales")
	public String listarEditoriales(Model model) {
		model.addAttribute("editoriales", service.listarEditoriales());
		return ""; // RUTAS DEL THYMELEAF
	}
	
	@GetMapping("editoriales/nuevo")
	public String mostrarFormNuevo(Model model) {
		Editorial editorial = new Editorial();
		model.addAttribute("editorial", editorial);
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/editoriales")
	public String guardarEditorial(@ModelAttribute("editorial") Editorial editorial) {
		service.guardarEditorial(editorial);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/editoriales/editar/{id}")
	public String mostrarFormActualizar(@PathVariable Integer id, Model model) {
		model.addAttribute("editorial", service.obtenerEditorialId(id));
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/editoriales/{id}")
	public String actualizarEditorial(@PathVariable Integer id, @ModelAttribute("editorial") Editorial editorial, Model model) {
		Editorial EditorialE = service.obtenerEditorialId(id);
		EditorialE.setEditorial_id(editorial.getEditorial_id());
		EditorialE.setNombre(editorial.getNombre());
		EditorialE.setFecha_creacion(editorial.getFecha_creacion());
		service.actualizarEdirtorial(EditorialE);		
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/editoriales/{id}")
	public String eliminarEditorial(@PathVariable Integer id) {
		service.eliminarEditorial(id);
		return ""; // RUTAS DEL THYMELEAF
	}

}
