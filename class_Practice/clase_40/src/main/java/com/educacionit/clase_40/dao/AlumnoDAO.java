package com.educacionit.clase_40.dao;

import java.util.List;

import com.educacionit.clase_40.model.Alumno;

public interface AlumnoDAO {

	public List<Alumno> getAll();

	public Alumno save(Alumno alumno);

}
