package com.educacionit.dao.main;

import java.sql.Date;
import java.util.List;

import com.educacionit.dao.AlumnoDAO;
import com.educacionit.dao.impl.AlumnoDAOImpl;
import com.educacionit.dao.service.AlumnoProfesorCursoService;
import com.educacionit.dao.service.impl.AlumnoProfesorCursoServiceImpl;
import com.educacionit.model.Alumno;
import com.educacionit.model.Curso;
import com.educacionit.model.Especialidad;
import com.educacionit.model.Profesor;

public class MainDAO {
    private static final Integer ID_CURSO = 3;

    @SuppressWarnings({ "unused", "deprecation" })
    public static void main(String[] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
        List<Alumno> listaAlumnos = alumnoDAO.buscarTodos();

        AlumnoProfesorCursoService service = new AlumnoProfesorCursoServiceImpl();

        //// -----------------
        /// Funcionalidad de negocio
        /// ------------------

        /// Permitir inscribir a un curso a un alumno nuevo
        Alumno alumnoNuevo = new Alumno(-1, "Gonzalo", "Cardin", 22, "San Martin 2523", new Date(26, 12, 2001),
                new Especialidad(1, "Administración"));
        service.inscribirAlumnoNuevoCurso(alumnoNuevo, ID_CURSO);

        /// Permitir Incribir a un nuevo profesor en un nuevo curso
        Profesor profesorNuevo = new Profesor("Cristian", "Saccomano", new Date(8, 10, 1979));
        Curso cursoNuevo = new Curso("Matemáticas", "Fase 1");
        service.inscribirNuevoProfesorANuevoCurso(profesorNuevo, cursoNuevo);

        /// Permitir modificar un alumno en una nueva especialidad.
        Especialidad nuevaEspecialidad = new Especialidad("Aritmética");
        service.modificarAlumnoConNuevaEspecialidad(alumnoNuevo, nuevaEspecialidad);
    }

}
