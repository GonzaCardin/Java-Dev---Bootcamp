package com.educacionit.dao.impl;

import java.util.List;

import com.educacionit.dao.InscripcionProfesorCursosDAO;
import com.educacionit.model.IncripcionProfesorCurso;
import com.educacionit.model.Profesor;

public class IncripcionProfesorCursoDAOImpl implements InscripcionProfesorCursosDAO{

    @Override
    public IncripcionProfesorCurso buscarPorIdProfesorCurso(Integer idProfesor, Integer idCurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorIdProfesorCurso'");
    }

    @Override
    public List<IncripcionProfesorCurso> buscarPorProfesor(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorProfesor'");
    }

    @Override
    public void alta(Integer idProfesor, Integer idCurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alta'");
    }

    @Override
    public void baja(Profesor profesor, Integer idCurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'baja'");
    }

    @Override
    public void modificar(Profesor profesor, Integer idCursoActual, Integer idCursoNuevo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

}
