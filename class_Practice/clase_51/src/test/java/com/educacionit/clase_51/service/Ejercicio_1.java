package com.educacionit.clase_51.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_51.entities.Author;
import com.educacionit.clase_51.entities.Book;
import com.educacionit.clase_51.entities.Publisher;

// 1.	Insertar un nuevo autor con libros asociados y un editor.
@SpringBootTest
public class Ejercicio_1 {
    @Autowired
    private PublisherService publisherService;

    @Autowired
    private AuthorService authorService;
    @Test
    void ejercicio_1(){
        
        Author anAuthor = new Author();
        anAuthor.setName("Cristian");
        
        Publisher aPublisher = new Publisher();
        aPublisher.setName("La Quinta Salida");
        aPublisher =publisherService.savePublisher(aPublisher);


        Book aBook = new Book();
        aBook.setTitle("Martin Fierro");
        aBook.setPublicationDate(LocalDate.of(1940, 11, 20));
        aBook.setAuthor(anAuthor);
        aBook.setPublisher(aPublisher);

        Book aBook2 = new Book();
        aBook2.setTitle("La Fortuna");
        aBook2.setPublicationDate(LocalDate.of(1940, 11, 20));
        aBook2.setAuthor(anAuthor);
        aBook2.setPublisher(aPublisher);

        // anAuthor.getBooks().add(aBook);
        // anAuthor.getBooks().add(aBook2);

        List<Book> books = new ArrayList<>();
        books.add(aBook);
        books.add(aBook2);

        anAuthor.setBooks(books);

        anAuthor = authorService.saveAuthor(anAuthor);
        
        

    }
}
