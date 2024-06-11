package com.educacionit.clase_51.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 5.	Actualizar el nombre de un autor usando una transacción.
@SpringBootTest
public class Ejercicio_5 {

    @Autowired
    private AuthorService authorService;

    @Test
    public void ejercicio_5(){
        Long authorId = 1l;
        String authorName = "Eduardo";

        authorService.updateAuthorName(authorId, authorName);
    }
}
