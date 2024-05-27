package com.educacionit.clase_40.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.educacionit.clase_40.model.Alumno;
import com.educacionit.clase_40.repository.AlumnoRepository;


@Repository("alumnoRepository")
public class AlumnoRepositoryImpl implements AlumnoRepository {
	
	private static List<Alumno>  alumnos = new ArrayList<>();

    public AlumnoRepositoryImpl() {
		alumnos.add(new Alumno(1234, "Eduardo",27));
		alumnos.add(new Alumno(5678, "Cristian",30));
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
