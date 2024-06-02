// package com.educacionit.clase_49.service.impl;

// import com.educacionit.clase_49.entity.Alumno;
// import com.educacionit.clase_49.repository.AlumnoRepository;
// import com.educacionit.clase_49.service.AlumnoService;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.when;

// @SpringBootTest
// public class AlumnoServiceImplTest_2 {

//     @Autowired
//     private AlumnoService alumnoService;

//     @MockBean
//     private AlumnoRepository alumnoRepository;

//     @BeforeEach
//     public void setUp() {
//         Alumno alumno1 = new Alumno("John Doe", 12345);
//         Alumno alumno2 = new Alumno("Jane Doe", 54321);

//         List<Alumno> alumnos = new ArrayList<>();
//         alumnos.add(alumno1);
//         alumnos.add(alumno2);

//         when(alumnoRepository.findAll()).thenReturn(alumnos);
//         when(alumnoRepository.findById(1L)).thenReturn(Optional.of(alumno1));
//         when(alumnoRepository.save(any(Alumno.class))).thenAnswer(i -> i.getArgument(0));
//     }

//     @Test
//     public void testGetAllAlumnos() {
//         List<Alumno> alumnos = alumnoService.getAllAlumnos();
//         assertNotNull(alumnos);
//         assertEquals(2, alumnos.size());
//     }

//     @Test
//     public void testGetAlumnoById() throws Exception {
//         Alumno alumno = alumnoService.getAlumnoById(1L);
//         assertNotNull(alumno);
//         assertEquals("John Doe", alumno.getNombre());
//     }

//     @Test
//     public void testSaveAlumno() {
//         Alumno newAlumno = new Alumno("New Student", 67890);
//         Alumno savedAlumno = alumnoService.saveAlumno(newAlumno);
//         assertNotNull(savedAlumno);
//         assertEquals("New Student", savedAlumno.getNombre());
//     }

//     @Test
//     public void testDeleteAlumno() {
//         alumnoService.deleteAlumno(1L);
//         Mockito.verify(alumnoRepository, Mockito.times(1)).deleteById(1L);
//     }
// }
