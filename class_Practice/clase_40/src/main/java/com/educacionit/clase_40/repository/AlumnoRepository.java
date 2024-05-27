package com.educacionit.clase_40.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.educacionit.clase_40.model.Alumno;



@Repository("alumnoRepository")
public interface AlumnoRepository {
	
	public List<Alumno> getAll();
	
	public Alumno save(Alumno alumno);


}