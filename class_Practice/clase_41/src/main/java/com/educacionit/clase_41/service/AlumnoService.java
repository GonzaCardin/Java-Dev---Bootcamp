package com.educacionit.clase_41.service;

import java.util.List;

import com.educacionit.clase_41.model.Alumno;

public interface AlumnoService {
    List<Alumno> getAllAlumnos();
    Alumno getAlumnoById(Integer id);
    void addAlumno(Alumno alumno);
    void updateAlumno(Integer legajo,Alumno alumno);
    void deleteAlumno(Integer legajo);
}
