package com.kodilla.library.service;

import com.kodilla.library.domain.reader.Book;
import com.kodilla.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    private final BookRepository bookRepository;

    public DbService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
