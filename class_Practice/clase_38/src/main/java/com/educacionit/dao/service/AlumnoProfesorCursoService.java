package com.educacionit.dao.service;

import java.util.List;

import com.educacionit.model.Alumno;
import com.educacionit.model.Curso;
import com.educacionit.model.Especialidad;
import com.educacionit.model.IncripcionAlumnoCurso;
import com.educacionit.model.Profesor;

public interface AlumnoProfesorCursoService {
    /// Permitir inscribir a un curso a un alumno nuevo
    public void inscribirAlumnoNuevoCurso(Alumno alumnoNuevo, Integer idCurso);

    /// Permitir Incribir a un nuevo profesor en un nuevo curso
    public void inscribirNuevoProfesorANuevoCurso(Profesor nuevoProfesor, Curso nuevoCurso);

    ///Permitir modificar un alumno en una nueva especialidad.
    public void modificarAlumnoConNuevaEspecialidad(Alumno alumno, Especialidad especialidad);

    //Obtener todos los cursos en los que está inscrito un alumno específico.
    public List<IncripcionAlumnoCurso> obtenerCursosDeAlumno(Integer idAlumno);
}
