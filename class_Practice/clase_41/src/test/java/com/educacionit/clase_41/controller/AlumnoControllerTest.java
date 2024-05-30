package com.educacionit.clase_41.controller;

import static org.junit.jupiter.api.Assertions.fail;

import static org.mockito.Mockito.when;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.educacionit.clase_41.model.Alumno;
import com.educacionit.clase_41.service.AlumnoService;

@ExtendWith(MockitoExtension.class) // Use Mockito extension for JUnit 5 tests.
public class AlumnoControllerTest {
    private MockMvc mockMvc; // Declare MockMvc to simulate HTTP requests.

    @Mock
    private AlumnoService alumnoService; // Mock the AlumnoService to be used in tests.

    @InjectMocks
    private AlumnoController alumnoController; // Inject mocks into AlumnoController for testing.

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(alumnoController).build(); // Initialize MockMvc with the controller under test.
    }

    @Test
    void testAddAlumno() throws Exception {
        // Perform a POST request to add a new alumno and expect a 201 Created status.
        mockMvc.perform(post("/alumnos/")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"legajo\":1,\"nombre\":\"Juan\",\"edad\":20}"))
                .andExpect(status().isCreated());
    }

    @Test
    void testDeleteAlumno() throws Exception {
        // Perform a DELETE request to remove an alumno and expect a 200 OK status.
        mockMvc.perform(delete("/alumnos/123"))
        .andExpect(status().isOk());
    }

    @Test
    void testGetAllAlumnos() {
        final List<Alumno> alumnos = new ArrayList<>(); // Create a list of Alumno objects.
        alumnos.add(new Alumno(1, "Nombre 1", 30)); // Add mock data to the list.
        alumnos.add(new Alumno(2, "Nombre 2", 40));

        when(alumnoService.getAllAlumnos()).thenReturn(alumnos); // Mock the service call to return the mock data.

        try {
            // Perform a GET request to fetch all alumnos and validate the response content.
            mockMvc.perform(get("/alumnos/")).andExpect(content().contentType(MediaType.APPLICATION_JSON))
                    .andExpect(jsonPath("$[0].legajo").value(1))
                    .andExpect(jsonPath("$[0].nombre").value("Nombre 1"))
                    .andExpect(jsonPath("$[0].edad").value(30))
                    .andExpect(jsonPath("$[1].legajo").value(2))
                    .andExpect(jsonPath("$[1].nombre").value("Nombre 2"))
                    .andExpect(jsonPath("$[1].edad").value(40));
        } catch (Exception e) {
            fail("Se produjo un error llamando a getAllAlumnos"); // Fail the test if an exception occurs.
        }
    }

    @Test
    void testGetAlumnoByIdOk() {
        Alumno alumno = new Alumno(1000, "Rogelio", 51); // Create a mock Alumno object.
        when(alumnoService.getAlumnoById(1000)).thenReturn(alumno); // Mock the service call to return the mock Alumno.

        try {
            // Perform a GET request to fetch an alumno by ID and validate the response content.
            mockMvc.perform(get("/alumnos/1000"))
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("legajo").value(1000))
                    .andExpect(jsonPath("nombre").value("Rogelio"))
                    .andExpect(jsonPath("edad").value(51));
        } catch (Exception e) {
            fail("Se produjo un error llamando a getAlumnoById"); // Fail the test if an exception occurs.
        }
    }

    @Test
    void testGetAlumnoByIdError() {
        when(alumnoService.getAlumnoById(9999)).thenReturn(null); // Mock the service call to return null for a non-existent ID.

        try {
            // Perform a GET request for a non-existent alumno ID and expect a 404 Not Found status.
            mockMvc.perform(get("/alumnos/9999"))
                    .andExpect(status().isNotFound());
        } catch (Exception e) {
            fail("Se produjo un error llamando a getAlumnoById"); // Fail the test if an exception occurs.
        }
    }

    @Test
    void testUpdateAlumno() throws Exception {
        // Perform a PUT request to update an alumno and expect a 200 OK status.
        mockMvc.perform(put("/alumnos/123")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"legajo\":1,\"nombre\":\"Juan\",\"edad\":20}"))
                .andExpect(status().isOk());
    }
}