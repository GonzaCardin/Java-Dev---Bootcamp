package com.educacionit.dao.impl;

import java.util.List;

import com.educacionit.dao.InscripcionAlumnoCursosDAO;
import com.educacionit.model.Alumno;
import com.educacionit.model.IncripcionAlumnoCurso;

public class IncripcionAlumnoCursoDAOImpl implements InscripcionAlumnoCursosDAO{

    @Override
    public IncripcionAlumnoCurso buscarPorIdAlumnoCurso(Integer idAlumno, Integer idCurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorIdAlumnoCurso'");
    }

    @Override
    public List<IncripcionAlumnoCurso> buscarPorAlumno(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorAlumno'");
    }

    @Override
    public void alta(Alumno alumno, Integer iDcurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alta'");
    }

    @Override
    public void baja(Alumno alumno, Integer idCurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'baja'");
    }

    @Override
    public void modificar(Alumno alumno, Integer idCursoActual, Integer idCursoNuevo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

}
