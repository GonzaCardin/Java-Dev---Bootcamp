package com.educacionit.clase_40.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.educacionit.clase_40.model.Alumno;

@Service("alumnoService")
public interface AlumnoService {
	
	public List<Alumno> getAll();
	
	public Alumno save(Alumno alumno);

}
