package com.educacionit.clase_41.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.clase_41.model.Alumno;
import com.educacionit.clase_41.service.AlumnoService;

@RestController // Indica a spring que devuelve un json
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    @Qualifier("alumnoService")
    private AlumnoService alumnoService;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> getAllAlumnos() {
        List<Alumno> alumnos = alumnoService.getAllAlumnos();

        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }

    @GetMapping("/{legajo}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable("legajo") Integer legajo) {
        Alumno unAlumno = alumnoService.getAlumnoById(legajo);

        if (unAlumno == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(unAlumno, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Void> addAlumno(@RequestBody Alumno alumno) {
        alumnoService.addAlumno(alumno);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{legajo}")
    public ResponseEntity<Void> updateAlumno(@PathVariable("legajo") Integer legajo, @RequestBody Alumno alumno) {
        alumnoService.updateAlumno(legajo, alumno);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{legajo}")
    public ResponseEntity<Void> deleteAlumno(@PathVariable("legajo") Integer legajo) {
        alumnoService.deleteAlumno(legajo);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
