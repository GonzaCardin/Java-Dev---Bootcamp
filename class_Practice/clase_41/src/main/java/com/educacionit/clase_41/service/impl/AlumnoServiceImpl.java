package com.educacionit.clase_41.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educacionit.clase_41.model.Alumno;
import com.educacionit.clase_41.repository.AlumnoRepository;
import com.educacionit.clase_41.service.AlumnoService;

@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    @Qualifier("alumnoRepository")
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno getAlumnoById(Integer id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public void addAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    @Override
    public void updateAlumno(Integer legajo, Alumno alumno) {
        Alumno existeAlumno = alumnoRepository.findById(legajo);
        if(existeAlumno != null){
            existeAlumno.setNombre(alumno.getNombre());
            existeAlumno.setEdad(alumno.getEdad());
        }
    }

    @Override
    public void deleteAlumno(Integer legajo) {
        alumnoRepository.delete(legajo);
    }

}
