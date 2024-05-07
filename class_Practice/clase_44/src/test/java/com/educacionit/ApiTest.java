package com.educacionit;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ApiTest {
    @Test
    public void testConcat() {
        Api test = new Api();
        String resultado = test.concat("Hola ", "Mundo");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals("Hola Mundo", resultado);
    }
    @Test
    public void testConcatSegundoParametroNulo() {
        Api test = new Api();
        try {
            @SuppressWarnings("unused")
            String resultado = test.concat("Hola", null);
            fail("El método concat con el segundo parárametro en null debería lanzar una exception");
        } catch (Exception e) {
            ///logger.info("El método concat anduvo perfecto!!!. Devolvío la exception {}",e.getMessage());
        }
    }

    @Test
    public void testContiene() {
        Api test = new Api();
        List<Integer> l = Arrays.asList(1,2,3);
        boolean cotains = test.contiene(l, 2);
        Assertions.assertNotNull(cotains,"El resultado no debe ser nulo");
        Assertions.assertTrue(cotains,"El resultado deberia ser TRUE pero contiene () devolvio FALSE");
    }

    @Test
    public void testSuma() {
        Api test = new Api();
        Integer resultado = test.suma(1,1);
        Assertions.assertEquals(2,resultado);
    }
    @Test
    public void testSumaPrimerParametroNulo() {
        Api test = new Api();
        Integer resultado = test.suma(null,1);
        Assertions.assertEquals(-1,resultado);
    }
    @Test
    public void testSumaSegundoParametroNulo() {
        Api test = new Api();
        Integer resultado = test.suma(1,null);
        Assertions.assertNull(resultado,"El resultado deberia ser nulo");
    }
    @Test
    public void agregarElementosTestOk() {
        Api test = new Api();
        List<Integer> lista = Arrays.asList(1,2,3);

        List<Integer> resultado = test.agregarElementos(lista, 5);
        
        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(1, resultado);

    }
}
