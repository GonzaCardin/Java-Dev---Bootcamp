package com.educacionit.clase_40.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.educacionit.clase_40.dao.AlumnoDAO;
import com.educacionit.clase_40.model.Alumno;

public class AlumnoDAOImpl implements AlumnoDAO {
	
	private static List<Alumno>  alumnos = new ArrayList<>();

	public AlumnoDAOImpl() {
		super();
		alumnos.add(new Alumno(1234, "Nombre1234",27));
		alumnos.add(new Alumno(5678, "Nombre5678",30));

	}

	@Override
	public List<Alumno> getAll() {
		return alumnos;
	}

	@Override
	public Alumno save(Alumno alumno) {
		alumnos.add(alumno);
		return alumno;
	}

}
