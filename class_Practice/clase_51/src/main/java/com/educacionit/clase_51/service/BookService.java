package com.educacionit.clase_51.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.clase_51.entities.Book;
import com.educacionit.clase_51.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public List<Book> findBooksByTitleLike(String title){
        return bookRepository.findByTitleContaining(title);
    }
}
