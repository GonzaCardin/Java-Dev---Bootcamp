package com.educacionit.clase_51.service;

import java.time.LocalDate;
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
    public List<Book> findBooksByTitleLike(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    public List<Book> findBooksGreaterThan(Long id) {
        return bookRepository.findByIdGreaterThan(id);
    }

    public List<Book> findBooksGreaterThanEqual(Long id) {
        return bookRepository.findByIdGreaterThanEqual(id);
    }

    public List<Book> findBooksLessThan(Long id) {
        return bookRepository.findByIdLessThan(id);
    }

    public List<Book> findBooksLessThanEqual(Long id) {
        return bookRepository.findByIdLessThanEqual(id);
    }

    public List<Book> findBooksNotEqual(Long id) {
        return bookRepository.findByIdNot(id);
    }

    public Long countBooks() {
        return bookRepository.count();
    }

    public List<Book> findBooksByPublicationDateBetween(LocalDate startDate, LocalDate endDate) {
        return bookRepository.findByPublicationDateBetween(startDate, endDate);
    }
}
