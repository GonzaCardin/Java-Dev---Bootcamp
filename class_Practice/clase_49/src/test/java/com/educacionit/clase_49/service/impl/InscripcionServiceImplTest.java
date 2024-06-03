package com.educacionit.clase_49.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.entity.Curso;
import com.educacionit.clase_49.entity.Inscripcion;
import com.educacionit.clase_49.repository.AlumnoRepository;
import com.educacionit.clase_49.repository.CursoRepository;
import com.educacionit.clase_49.repository.InscripcionRepository;
import com.educacionit.clase_49.service.InscripcionService;

@SpringBootTest
public class InscripcionServiceImplTest {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private InscripcionService inscripcionService;

    @Autowired
    private InscripcionRepository inscripcionRepository;

    private static final String NOMBRE_ALUMNO = "Juan";
    private static final Integer LEGAJO_ALUMNO = 12345678;
    private static final String DESCRPCION_CURSO = "Java";

    @Test
    void testInscribirAlumno() {
        // A - Pre condiciones del test -> Se puede hacer en el setup
        // 1 - Cargar un Alumno
        // 2 - Cargar un Curso

        Alumno unAlumno = new Alumno(NOMBRE_ALUMNO, LEGAJO_ALUMNO); // Creo la entidad
        alumnoRepository.save(unAlumno); // Persistir un Alumno

        Curso unCurso = new Curso(DESCRPCION_CURSO); // Creo la entidad
        cursoRepository.save(unCurso); // Persistir un Curso

        // B - Test
        inscripcionService.inscribirAlumno(unAlumno, unCurso); // Inserto la inscripción en la tabla

        Inscripcion unaInscripcion = inscripcionRepository.findByAlumnoAndCurso(unAlumno, unCurso);

        assertNotNull(unaInscripcion);
        assertNotNull(unaInscripcion.getId());

        assertNotNull(unaInscripcion.getCurso());
        assertEquals(unCurso.getId(), unaInscripcion.getCurso().getId());
        assertEquals(DESCRPCION_CURSO, unaInscripcion.getCurso().getDescripcion());

        assertNotNull(unaInscripcion.getAlumno());
        assertEquals(unAlumno.getId(), unaInscripcion.getAlumno().getId());
        assertEquals(NOMBRE_ALUMNO, unaInscripcion.getAlumno().getNombre());
        assertEquals(LEGAJO_ALUMNO, unaInscripcion.getAlumno().getLegajo());

        // C - Post condiciones del test -> Se puede hacer en el teardown
        // 1 - Borrar la Inscripcion
        // 2 - Borrar el Curso
        // 3 - Borrar el Alumno
        inscripcionRepository.delete(unaInscripcion);
        cursoRepository.delete(unCurso);
        alumnoRepository.delete(unAlumno);
    }

    @Test
    void testEliminarInscripcion() {
        // A - Pre-Carga del Test
        Alumno unAlumno = new Alumno(NOMBRE_ALUMNO, LEGAJO_ALUMNO); // Creo la entidad
        alumnoRepository.save(unAlumno); // Persistir un Alumno

        Curso unCurso = new Curso(DESCRPCION_CURSO); // Creo la entidad
        cursoRepository.save(unCurso); // Persistir un Curso

        Inscripcion unaInscripcion = new Inscripcion(unAlumno, unCurso);
        inscripcionRepository.save(unaInscripcion);

        // B - Test
        try {
            inscripcionService.eliminarInscripcion(unAlumno, unCurso);
        } catch (Exception e) {
            fail("No se pudo eliminar la inscripción del alumno " + unAlumno + ", con el curso " + unCurso);
        }

        Inscripcion inscripcionEnDB = inscripcionRepository.findByAlumnoAndCurso(unAlumno, unCurso);
        assertNull(inscripcionEnDB);

        // C - Limpieza
        cursoRepository.delete(unCurso);
        alumnoRepository.delete(unAlumno);
    }

}
