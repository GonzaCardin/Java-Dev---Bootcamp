package com.educacionit.clase_40.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.educacionit.clase_40.model.Alumno;
import com.educacionit.clase_40.service.AlumnoService;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

	@Autowired
	@Qualifier("alumnoService")
	private AlumnoService alumnoService;
	
	
	@GetMapping("/consultar-alumnos")
	public String mostrarTodosLosAlumnos(Model model) {
		
		List<Alumno> alumnos = alumnoService.getAll();
		
		model.addAttribute("alumnos", alumnos);
		
		return "consulta-alumnos";
	}
	
	
	
	@PostMapping("/alta-alumno")
	public String altaDeAlumno(@RequestParam Integer legajo, @RequestParam String nombre, @RequestParam Integer edad) {
		
		Alumno unAlumno = new Alumno(legajo, nombre,edad);
		
		alumnoService.save(unAlumno);
		
		return "redirect:/alumnos/consultar-alumnos";
	}
	
	
	
}
