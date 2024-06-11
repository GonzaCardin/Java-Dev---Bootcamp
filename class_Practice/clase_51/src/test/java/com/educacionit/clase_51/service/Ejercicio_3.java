package com.educacionit.clase_51.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_51.entities.Book;

@SpringBootTest
public class Ejercicio_3 {
    // 3. Buscar libros con ID mayor que un valor específico.

    @Autowired
    private BookService bookService;

    @Test
    public void ejercicio_3_MayorQue() {
        List<Book> books = bookService.findBooksGreaterThan(4l);
        for (Book book : books) {
            System.out.println("Libro Encontrado: " + book.getId());
        }
    }

    @Test
    public void ejercicio_3_MayorOIgualQue() {
        List<Book> books = bookService.findBooksGreaterThanEqual(7l);
        for (Book book : books) {
            System.out.println("Libro Encontrado: " + book.getId());
        }
    }

    @Test
    public void ejercicio_3_MenorQue() {
        List<Book> books = bookService.findBooksLessThan(4l);
        for (Book book : books) {
            System.out.println("Libro Encontrado: " + book.getId());
        }
    }

    @Test
    public void ejercicio_3_MenorOIgualQue() {
        List<Book> books = bookService.findBooksLessThanEqual(4l);
        for (Book book : books) {
            System.out.println("Libro Encontrado: " + book.getId());
        }
    }

    @Test
    public void ejercicio_3_DistintoQue() {
        List<Book> books = bookService.findBooksNotEqual(4l);
        for (Book book : books) {
            System.out.println("Libro Encontrado: " + book.getId());
        }
    }

    @Test
    public void ejercicio_3_ContarRegistros() {
        Long count = bookService.countBooks();
        System.out.println("Cantidad de libros en la base de datos: " + count);
    }
}
