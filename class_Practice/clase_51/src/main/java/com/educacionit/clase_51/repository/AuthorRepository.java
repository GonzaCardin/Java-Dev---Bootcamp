package com.educacionit.clase_51.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.clase_51.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
