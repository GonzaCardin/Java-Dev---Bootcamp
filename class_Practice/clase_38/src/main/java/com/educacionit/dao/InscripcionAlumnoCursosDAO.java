package com.educacionit.dao;

import java.util.List;

import com.educacionit.model.Alumno;
import com.educacionit.model.IncripcionAlumnoCurso;

public interface InscripcionAlumnoCursosDAO {
    
    public IncripcionAlumnoCurso buscarPorIdAlumnoCurso(Integer idAlumno, Integer idCurso);
    public List<IncripcionAlumnoCurso> buscarPorAlumno(Integer id);
    

    public void alta(Alumno alumno, Integer iDcurso);
    public void baja(Alumno alumno, Integer  idCurso);
    public void modificar(Alumno alumno,Integer idCursoActual, Integer idCursoNuevo); 
}
