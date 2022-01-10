package com.kodilla.library.service;

import com.kodilla.library.domain.reader.Book;
import com.kodilla.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbService {
    @Autowired
    private final BookRepository bookRepository;



    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
