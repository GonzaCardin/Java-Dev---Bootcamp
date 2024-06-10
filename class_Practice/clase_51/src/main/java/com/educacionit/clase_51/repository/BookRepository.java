package com.educacionit.clase_51.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.clase_51.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContaining(String title);

}
