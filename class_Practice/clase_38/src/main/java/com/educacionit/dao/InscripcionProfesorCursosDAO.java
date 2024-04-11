package com.educacionit.dao;

import java.util.List;

import com.educacionit.model.Profesor;

import com.educacionit.model.IncripcionProfesorCurso;


public interface InscripcionProfesorCursosDAO {
    
    public IncripcionProfesorCurso buscarPorIdProfesorCurso(Integer idProfesor, Integer idCurso);
    public List<IncripcionProfesorCurso> buscarPorProfesor(Integer id);
    

    public void alta(Integer idProfesor, Integer idCurso);
    public void baja(Profesor profesor, Integer  idCurso);
    public void modificar(Profesor profesor,Integer idCursoActual, Integer idCursoNuevo); 
}
