package com.educacionit.clase_49.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.repository.AlumnoRepository;
import com.educacionit.clase_49.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno getAlumnoById(Long id) throws Exception {
        Optional<Alumno> unAlumno = alumnoRepository.findById(id);
        if (unAlumno.isPresent()) {
            return unAlumno.get();
        } else {
            throw new Exception("El alumno con id: " + id + " no fue encontrado en la base de datos");
        }
        // return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    public Alumno saveAlumno(Alumno unAlumno) {
        return alumnoRepository.save(unAlumno);
    }

    @Override
    public void deleteAlumno(Long id) {
        alumnoRepository.deleteById(id);        
    }

}
