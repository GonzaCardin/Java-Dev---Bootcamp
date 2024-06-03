package com.educacionit.clase_49.service.impl;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.entity.Curso;
import com.educacionit.clase_49.entity.Inscripcion;
import com.educacionit.clase_49.model.AlumnoConCursosDTO;
import com.educacionit.clase_49.repository.AlumnoRepository;
import com.educacionit.clase_49.repository.CursoRepository;
import com.educacionit.clase_49.repository.InscripcionRepository;
import com.educacionit.clase_49.service.AlumnoConCursosService;

@SpringBootTest
public class AlumnoConCursosServiceImplTest {

    private static final String NOMBRE_ALUMNO = "Juan";
    private static final Integer LEGAJO_ALUMNO = 12345678;
    private static final String DESCRPCION_CURSO = "Java";
    private static final String DESCRPCION_CURSO_2 = "Python";

    // @Autowired
    // private AlumnoConCursosRepository alumnoConCursosRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private InscripcionRepository inscripcionRepository;

    @Autowired
    private AlumnoConCursosService alumnoConCursosService;

    Curso unCurso_1;
    Curso unCurso_2;
    private Alumno unAlumno;
    Inscripcion unaInscripcion_01;
    Inscripcion unaInscripcion_02;

    @BeforeEach
    void setup() {
        unAlumno = new Alumno(NOMBRE_ALUMNO, LEGAJO_ALUMNO);
        alumnoRepository.save(unAlumno);

        unCurso_1 = new Curso(DESCRPCION_CURSO);
        unCurso_2 = new Curso(DESCRPCION_CURSO_2);
        cursoRepository.save(unCurso_1);
        cursoRepository.save(unCurso_2);

        unaInscripcion_01 = new Inscripcion(unAlumno, unCurso_1);
        unaInscripcion_02 = new Inscripcion(unAlumno, unCurso_2);
        inscripcionRepository.save(unaInscripcion_01);
        inscripcionRepository.save(unaInscripcion_02);
    }

    @Test
    void testGetAlumnoConCursosById() {
        AlumnoConCursosDTO unAlumnoConCursosDTO = null;
        try {
            unAlumnoConCursosDTO = alumnoConCursosService.getAlumnoConCursosById(unAlumno.getId());
        } catch (Exception e) {
            fail("No se pudo obtener el alumno con sus cursos con Id: " + unAlumno.getId());
        }
        assertNotNull(unAlumnoConCursosDTO);
        assertNotNull(unAlumnoConCursosDTO.getCursos());

        // List<Curso> cursos = unAlumnoConCursosDTO.getCursos();
        // for(Curso curso : cursos){
        //     System.out.println(curso);
        // }

        assertTrue(unAlumnoConCursosDTO.getCursos().contains(DESCRPCION_CURSO));
        assertTrue(unAlumnoConCursosDTO.getCursos().contains(DESCRPCION_CURSO_2));
    }

    @AfterEach
    void tearDown() {
        inscripcionRepository.delete(unaInscripcion_01);
        inscripcionRepository.delete(unaInscripcion_02);

        cursoRepository.delete(unCurso_1);
        cursoRepository.delete(unCurso_2);

        alumnoRepository.delete(unAlumno);
    }

}
