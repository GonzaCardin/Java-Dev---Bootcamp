package com.educacionit.clase_51.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_51.entities.Book;


// 2.	Buscar libros con título que contenga una palabra clave.
@SpringBootTest
public class Ejercicio_2 {
    @Autowired
    private BookService bookService;

    @Test
    void ejercicio_2() {
        String title = "Book";
        List<Book> books = bookService.findBooksByTitleLike(title);

        for (Book book : books) {
            System.out.println(book.getId() + ".- " + book.getTitle() + ".- " + book.getPublicationDate());
            System.out.println(book.getPublisher().getName());
            System.out.println(book.getAuthor().getName());
        }
        
    }
}
