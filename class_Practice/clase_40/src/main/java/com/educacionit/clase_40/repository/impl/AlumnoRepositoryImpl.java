package com.educacionit.clase_40.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.educacionit.clase_40.model.Alumno;
import com.educacionit.clase_40.repository.AlumnoRepository;


@Repository("alumnoRepository")
@Scope("prototype")
public class AlumnoRepositoryImpl implements AlumnoRepository {
<<<<<<< HEAD
	
	private static List<Alumno>  alumnos = new ArrayList<>();

    public AlumnoRepositoryImpl() {
		alumnos.add(new Alumno(1234, "Eduardo",27));
		alumnos.add(new Alumno(5678, "Cristian",30));
    }

	@Override
	public List<Alumno> getAll() {	
=======
	private static final List<Alumno> alumnos = new ArrayList<>();

    public AlumnoRepositoryImpl() {
		super();
		alumnos.add(new Alumno(1234, "Nombre1234",27));
		alumnos.add(new Alumno(5678, "Nombre5678",30));

    }

	@Override
	public List<Alumno> getAll() {
>>>>>>> class_branch
		return alumnos;
	}

	@Override
	public Alumno save(Alumno alumno) {
<<<<<<< HEAD
		alumnos.add(alumno);
		return alumno;		
=======
		// AlumnoDAO alumnoDao = new AlumnoDAOImpl();
		alumnos.add(alumno);
		return alumno;
>>>>>>> class_branch
	}

}
