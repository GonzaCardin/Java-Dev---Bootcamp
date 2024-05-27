package com.educacionit.clase_40.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.educacionit.clase_40.dao.AlumnoDAO;
import com.educacionit.clase_40.dao.impl.AlumnoDAOImpl;
import com.educacionit.clase_40.model.Alumno;
import com.educacionit.clase_40.repository.AlumnoRepository;


@Repository("alumnoRepository")
public class AlumnoRepositoryImpl implements AlumnoRepository {
	

	@Override
	public List<Alumno> getAll() {
		AlumnoDAO alumnoDao = new AlumnoDAOImpl();
		
		return alumnoDao.getAll();
	}

	@Override
	public Alumno save(Alumno alumno) {
		AlumnoDAO alumnoDao = new AlumnoDAOImpl();
		
		return alumnoDao.save(alumno);
	}

}
