package com.educacionit.clase_40.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educacionit.clase_40.model.Alumno;
import com.educacionit.clase_40.repository.AlumnoRepository;
import com.educacionit.clase_40.service.AlumnoService;



@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	@Qualifier("alumnoRepository")
	private AlumnoRepository alumnoRepository;

	@Override
	public List<Alumno> getAll() {
		return alumnoRepository.getAll();
	}

	@Override
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

}
