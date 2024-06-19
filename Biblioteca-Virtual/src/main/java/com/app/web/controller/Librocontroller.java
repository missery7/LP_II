package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Libro;
import com.app.web.service.LibroService;

@Controller
public class Librocontroller {

	@Autowired
	private LibroService service;

	@GetMapping("/libros")
	public String listarLibros(Model model) {
		model.addAttribute("libros", service.listarLibros());
		return ""; // RUTAS DEL THYMELEAF
	}

	/*
	 * SI AGREGARAS UN APARTADO DE CREACION O INGRESO DE NUEVO LIBRO SE USARIA LOS 2
	 * METODOS SGTS :V 1 Y 2
	 */

	@GetMapping("libros/nuevo") // 1
	public String mostrarFormNuevo(Model model) {
		Libro libro = new Libro();
		model.addAttribute("libro", libro);
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/libros") // 2
	public String guardarLibros(@ModelAttribute("libro") Libro libro) {
		service.guardarLibro(libro);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/libros/editar/{id}")
	public String mostrarFormActualizar(@PathVariable Integer id, Model model) {
		model.addAttribute("libro", service.obtenerLibroId(id));
		return ""; // RUTAS DEL THYMELEAF
	}

	@PostMapping("/libros/{id}")
	public String actualizarLibro(@PathVariable Integer id, @ModelAttribute("libro") Libro libro, Model model) {
		Libro libroE = service.obtenerLibroId(id);
		libroE.setLibro_id(libro.getLibro_id());
		libroE.setTitulo(libro.getTitulo());
		libroE.setSinopsis(libro.getSinopsis());
		libroE.setEditorial_id(libro.getEditorial_id());
		libroE.setFecha_lanzamiento(libro.getFecha_lanzamiento());
		libroE.setEjemplares(libro.getEjemplares());
		libroE.setUrl_imagen(libro.getUrl_imagen());
		libroE.setValoracion(libro.getValoracion());
		libroE.setFecha_creacion(libro.getFecha_creacion());
		service.actualizarLibro(libroE);
		return ""; // RUTAS DEL THYMELEAF
	}

	@GetMapping("/libros/{id}")
	public String eliminarLibro(@PathVariable Integer id) {
		service.eliminarLibro(id);
		return ""; // RUTAS DEL THYMELEAF
	}

}
