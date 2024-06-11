package com.educacionit.clase_51.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 4.	Eliminar un autor y todos sus libros asociados.
@SpringBootTest
public class Ejercicio_4 {
    @Autowired
    private AuthorService authorService;

    @Test
    public void ejercicio_4() {
        authorService.deleteAuthor(5l);
    }
}
