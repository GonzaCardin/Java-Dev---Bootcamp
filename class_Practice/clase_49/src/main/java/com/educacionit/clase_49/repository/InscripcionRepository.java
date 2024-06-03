package com.educacionit.clase_49.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.clase_49.entity.Alumno;
import com.educacionit.clase_49.entity.Curso;
import com.educacionit.clase_49.entity.Inscripcion;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
    Inscripcion findByAlumnoAndCurso(Alumno alumno, Curso curso);
    /*
     * findBy sería como el pretexto y dps "Alumno" And "Curso" son las dos
     * entidades, y como cada entidad
     * esta tiene su @Id, entonces JPA hace solo el select basandose en sus
     * respectivos id.
     */
}
