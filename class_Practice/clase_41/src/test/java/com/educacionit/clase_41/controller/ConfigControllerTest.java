package com.educacionit.clase_41.controller;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ConfigControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetConfig() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/configuracion/propiedades"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.view().name("mostrar-propiedades"))
                    .andExpect(MockMvcResultMatchers.model().attribute("nombre1","este es el valor de nombre 1"))
                    .andExpect(MockMvcResultMatchers.model().attribute("nombre2","este es el valor de nombre 2"))
                    .andExpect(MockMvcResultMatchers.model().attribute("propiedad1","23"))
                    .andExpect(MockMvcResultMatchers.model().attribute("propiedad2","valor de la propiedad 2"));
        } catch (Exception e) {
            fail("Falló el controlador");
        }
    }
}
