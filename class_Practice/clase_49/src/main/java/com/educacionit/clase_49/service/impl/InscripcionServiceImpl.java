package com.educacionit.clase_49.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.entity.Curso;
import com.educacionit.clase_49.entity.Inscripcion;
import com.educacionit.clase_49.repository.InscripcionRepository;
import com.educacionit.clase_49.service.InscripcionService;

public class InscripcionServiceImpl implements InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    @Override
    public void inscribirAlumno(Alumno unAlumno, Curso unCurso) {
        Inscripcion unaInscripcion = new Inscripcion();

        unaInscripcion.setAlumno(unAlumno);
        unaInscripcion.setCurso(unCurso);

        inscripcionRepository.save(unaInscripcion);
    }

    @Override
    public void eliminarInscripcion(Alumno unAlumno, Curso unCurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarInscripcion'");
    }

    @Override
    public void inscribirAlumno(Long idAlumno, Long idCurso) {
        Alumno unAlumno = new Alumno();
        unAlumno.setId(idAlumno);
        
        Curso unCurso = new Curso();
        unCurso.setId(idCurso);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno, unCurso);
        inscripcionRepository.save(unaInscripcion);

    }

}
