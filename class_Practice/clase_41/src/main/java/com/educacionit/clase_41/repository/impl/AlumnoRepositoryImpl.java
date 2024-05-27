package com.educacionit.clase_41.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.educacionit.clase_41.model.Alumno;
import com.educacionit.clase_41.repository.AlumnoRepository;
@Repository("alumnoRepository")
public class AlumnoRepositoryImpl implements AlumnoRepository {
    private List<Alumno> alumnos = new ArrayList<Alumno>();
    @Override
    public List<Alumno> findAll() {
        return alumnos;
    }

    @Override
    public Alumno findById(Integer legajo) {
        return alumnos.stream().filter(a-> a.getLegajo() == legajo).findFirst().orElse(null);
    }

    @Override
    public void save(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public void delete(Integer legajo) {
        alumnos.removeIf(a-> a.getLegajo() == legajo);
    }

}
