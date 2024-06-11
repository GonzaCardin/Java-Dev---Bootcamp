package com.educacionit.clase_51.repository;

import java.util.List;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.clase_51.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContaining(String title);

    // Mayor que
    List<Book> findByIdGreaterThan(Long id);

    // Mayor o igual que
    List<Book> findByIdGreaterThanEqual(Long id);

    // Menor que
    List<Book> findByIdLessThan(Long id);

    // Menor o igual que
    List<Book> findByIdLessThanEqual(Long id);

    // Distinto que
    List<Book> findByIdNot(Long id);

    long count();

    // Búsqueda por rango de fechas
    List<Book> findByPublicationDateBetween(LocalDate startDate, LocalDate endDate);
}
