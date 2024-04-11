package com.educacionit.dao.service.impl;

import java.util.List;

import com.educacionit.dao.AlumnoDAO;
import com.educacionit.dao.CursoDAO;
import com.educacionit.dao.EspecialidadDAO;
import com.educacionit.dao.InscripcionAlumnoCursosDAO;
import com.educacionit.dao.InscripcionProfesorCursosDAO;
import com.educacionit.dao.ProfesorDAO;
import com.educacionit.dao.impl.AlumnoDAOImpl;
import com.educacionit.dao.impl.CursoDAOImpl;
import com.educacionit.dao.impl.EspecialidadDAOImpl;
import com.educacionit.dao.impl.IncripcionAlumnoCursoDAOImpl;
import com.educacionit.dao.impl.IncripcionProfesorCursoDAOImpl;
import com.educacionit.dao.impl.ProfesorDAOImpl;
import com.educacionit.dao.service.AlumnoProfesorCursoService;
import com.educacionit.model.Alumno;
import com.educacionit.model.Curso;
import com.educacionit.model.Especialidad;
import com.educacionit.model.IncripcionAlumnoCurso;
import com.educacionit.model.Profesor;

public class AlumnoProfesorCursoServiceImpl implements AlumnoProfesorCursoService {
    private AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
    private ProfesorDAO profesorDAO = new ProfesorDAOImpl();
    private CursoDAO cursoDAO = new CursoDAOImpl();
    private InscripcionProfesorCursosDAO inscripcionProfesorCursosDAO = new IncripcionProfesorCursoDAOImpl();
    private EspecialidadDAO especialidadDAO = new EspecialidadDAOImpl();
    private InscripcionAlumnoCursosDAO inscripcionAlumnoCursosDAO = new IncripcionAlumnoCursoDAOImpl();

    @Override
    public void inscribirAlumnoNuevoCurso(Alumno alumnoNuevo, Integer idCurso) {

        Integer idAlumno = alumnoDAO.alta(alumnoNuevo);
        alumnoNuevo.setId(idAlumno);

        InscripcionAlumnoCursosDAO inscripcionAlumnoCursosDAO = new IncripcionAlumnoCursoDAOImpl();
        inscripcionAlumnoCursosDAO.alta(alumnoNuevo, idCurso);
    }

    @Override
    public void inscribirNuevoProfesorANuevoCurso(Profesor nuevoProfesor, Curso nuevoCurso) {

        /// 1- Alta profesor
        Integer idProfesor = profesorDAO.alta(nuevoProfesor);
        nuevoProfesor.setId(idProfesor);

        /// 2- Alta Curso
        Integer idCurso = cursoDAO.alta(nuevoCurso);
        nuevoCurso.setId(idCurso);

        /// 3- Asignar Curso a un Profesor
        inscripcionProfesorCursosDAO.alta(nuevoProfesor.getId(), nuevoCurso.getId());

    }

    @Override
    public void modificarAlumnoConNuevaEspecialidad(Alumno alumno, Especialidad especialidad) {
        /// 1- Dar de alta a nueva especialidad

        Integer idEspecialidad = especialidadDAO.alta(especialidad);
        especialidad.setId(idEspecialidad);

        /// 2- Modificar al alumno

        alumnoDAO.modificar(alumno);

    }

    @Override
    public List<IncripcionAlumnoCurso> obtenerCursosDeAlumno(Integer idAlumno) {
        return inscripcionAlumnoCursosDAO.buscarPorAlumno(idAlumno);
    }

}
