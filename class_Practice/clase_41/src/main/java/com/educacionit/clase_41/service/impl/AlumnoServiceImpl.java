package com.educacionit.clase_41.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educacionit.clase_41.model.Alumno;
import com.educacionit.clase_41.repository.AlumnoRepository;
import com.educacionit.clase_41.service.AlumnoService;

@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {
    private static final Logger logger = LoggerFactory.getLogger(AlumnoServiceImpl.class);

    @Autowired
    @Qualifier("alumnoRepository")
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno getAlumnoById(int id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public void addAlumno(Alumno alumno) {
        logger.info("Agregar alumno con nombre {}: . Toda la clase {}", alumno.getNombre(),alumno);
        alumnoRepository.save(alumno);
    }

    @Override
    public void updateAlumno(int legajo, Alumno alumno) {
        Alumno existeAlumno = alumnoRepository.findById(legajo);
        if (existeAlumno != null) {
            existeAlumno.setNombre(alumno.getNombre());
            existeAlumno.setEdad(alumno.getEdad());
        }
    }

    @Override
    public void deleteAlumno(int legajo) {
        alumnoRepository.delete(legajo);
    }

}
