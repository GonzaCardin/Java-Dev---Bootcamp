package com.educacionit.clase_41.repository;

import java.util.List;

import com.educacionit.clase_41.model.Alumno;

public interface AlumnoRepository {
    List<Alumno> findAll();

    Alumno findById(int legajo);

    void save(Alumno alumno);

    void delete(int legajo);
    // update se usa a través del save
}
