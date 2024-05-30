package com.educacionit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {
    private static final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    void testSumaOk() {
        Api test = new Api();
        Integer resultado = test.suma(1, 1);
        assertEquals(2, resultado);
    }

    @Test
    void testSumaPrimerParametroNulo() {
        Api test = new Api();
        Integer resultado = test.suma(null, 1);
        assertEquals(-1, resultado);
    }

    @Test
    void testSumaSegundoParametroNulo() {
        Api test = new Api();
        Integer resultado = test.suma(1, null);
        assertNull(resultado, "El resultado deberia ser null");
    }

    @Test
    void testContiene() {
        Api test = new Api();
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        Boolean resultado = test.contiene(lista, 4);
        assertNotNull(resultado, "El resultado no deberia ser null");
        assertTrue(resultado, "El resultado deberia ser true");
        assertFalse(!resultado, "El resultado no deberia ser false");
    }

    @Test
    void testNoContiene() {
        Api test = new Api();
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        Boolean resultado = test.contiene(lista, 1000);

        assertNotNull(resultado, "El resultado no deberia ser null");
        assertFalse(resultado, "El resultado no deberia ser false");
    }

    @Test
    void testContieneConListaVacia() {
        Api test = new Api();
        Boolean resultado = test.contiene(null, 1);

        assertNull(resultado, "El resultado deberia ser null");
    }

    @Test
    void testConcat() {
        Api test = new Api();
        String resultado = test.concat("Hello", " World");

        assertNotNull(resultado);
        assertEquals("Hello World", resultado);
    }

    @Test
    void testConcatSegundoParametroNulo() {
        Api test = new Api();
        try {
            @SuppressWarnings("unused")
            String resultado = test.concat("Hello", null);
            fail("El método concat con el segundo parámetro en null debería lanzar una Exception");
        } catch (Exception e) {
            logger.info("El método concat anduvo perfecto!!!. Devolvio la Exception {}", e.getMessage());
        }
    }

    @Test
    void agregarElementoTestOk() {
        Api test = new Api();
        List<Integer> lista = new ArrayList<>();
        Integer elemento = 1;

        List<Integer> resultado = test.agregarElemento(lista, elemento);

        assertNotNull(resultado);
        assertEquals(1,resultado.size());
    }

}
