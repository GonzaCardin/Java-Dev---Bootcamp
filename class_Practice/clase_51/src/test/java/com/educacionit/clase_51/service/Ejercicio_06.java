package com.educacionit.clase_51.service;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.clase_51.entities.Book;

@SpringBootTest
public class Ejercicio_06 {
    @Autowired
    private BookService bookService;

    @Test
    public void ejercicio_06(){
        LocalDate startDate = LocalDate.of(2020, 2, 1);
        LocalDate endDate = LocalDate.of(2020, 4, 05);

        List<Book> books = bookService.findBooksByPublicationDateBetween(startDate, endDate);
        for (Book book : books) {
            System.out.println("Id: " +book.getId() + " -  Publication Date: " + book.getPublicationDate());
        }


    }
}
