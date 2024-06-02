package com.educacionit.clase_49.service;

import java.util.List;

import com.educacionit.clase_49.entity.Alumno;

// Definción de lógica de negocio
public interface AlumnoService {
    List<Alumno> getAllAlumnos();

    Alumno getAlumnoById(Long id) throws Exception;

    Alumno saveAlumno(Alumno unAlumno);

    void deleteAlumno(Long id);
}
