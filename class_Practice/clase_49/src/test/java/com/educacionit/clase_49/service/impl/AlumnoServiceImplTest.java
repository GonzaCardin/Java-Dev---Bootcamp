package com.educacionit.clase_49.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.repository.AlumnoRepository;
import com.educacionit.clase_49.service.AlumnoService;

@SpringBootTest
public class AlumnoServiceImplTest {
    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Test
    void testDeleteAlumno() {
        // Creo el alumno
        Alumno unAlumno = new Alumno("Cristian", 25);
        Alumno alumnoGuardado = alumnoService.saveAlumno(unAlumno);

        // Verifico que se haya guardado correctamente
        assertNotNull(alumnoGuardado);
        assertNotNull(alumnoGuardado.getId());

        // Elimino al alumno utilizando el servicio
        alumnoService.deleteAlumno(alumnoGuardado.getId());

        // Verifico que el alumno haya sido eliminado
        Optional<Alumno> alumnoEliminado = alumnoRepository.findById(alumnoGuardado.getId());
        assertFalse(alumnoEliminado.isPresent());

    }

    @Test
    void testGetAllAlumnos() {
        List<Alumno> todosLosAlumnos = alumnoService.getAllAlumnos();
        assertNotNull(todosLosAlumnos);
    }

    @Test
    void testGetAlumnoById() throws Exception {
        //Crear un alumno
        Alumno unAlumno = new Alumno("Cristian", 25);
        Alumno alumnoGuardado = alumnoService.saveAlumno(unAlumno);

        // Buscar por Id - En capa de servicio
        Alumno elAlumnoBuscado = alumnoService.getAlumnoById(alumnoGuardado.getId());

        assertNotNull(elAlumnoBuscado);
        assertEquals(alumnoGuardado.getNombre(), elAlumnoBuscado.getNombre());
        assertEquals(alumnoGuardado.getId(),elAlumnoBuscado.getId());
        assertEquals(alumnoGuardado.getLegajo(), elAlumnoBuscado.getLegajo());

        //Limpieza - Borrar el caso creado
        alumnoRepository.delete(alumnoGuardado);
    }

    @Test
    void testSaveAlumno() {
        Alumno alumnoAGuardar = new Alumno("Cristian", 25);
        Alumno alumnoGuardado = alumnoService.saveAlumno(alumnoAGuardar);

        assertNotNull(alumnoGuardado);
        assertNotNull(alumnoGuardado.getId());

        alumnoRepository.deleteById(alumnoGuardado.getId());
    }
}
