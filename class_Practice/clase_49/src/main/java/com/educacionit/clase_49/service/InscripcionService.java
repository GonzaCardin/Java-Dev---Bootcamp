package com.educacionit.clase_49.service;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.entity.Curso;

public interface InscripcionService {
    void inscribirAlumno(Alumno unAlumno, Curso unCurso);
    // void inscribirAlumno(Long idAlumno, Long idCurso); // -> esta suele ser la mejor opción asi la capa repository no pasa la capa de servicio.

    void eliminarInscripcion(Alumno unAlumno, Curso unCurso) throws Exception;
}
