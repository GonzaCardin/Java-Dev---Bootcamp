package com.educacionit.clase_41.service;

import java.util.List;

import com.educacionit.clase_41.model.Alumno;

public interface AlumnoService {
    List<Alumno> getAllAlumnos();

    Alumno getAlumnoById(int id);

    void addAlumno(Alumno alumno);

    void updateAlumno(int legajo, Alumno alumno);

    void deleteAlumno(int legajo);
}
