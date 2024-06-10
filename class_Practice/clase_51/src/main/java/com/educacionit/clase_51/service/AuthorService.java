package com.educacionit.clase_51.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.clase_51.entities.Author;
import com.educacionit.clase_51.repository.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long authorId) {
        authorRepository.deleteById(authorId);
    }

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
