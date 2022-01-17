package com.kodilla.library.service;

import com.kodilla.library.domain.Book;
import com.kodilla.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbServiceBook {
    private final BookRepository bookRepository;
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBook (final Long bookId){
        return bookRepository.findById(bookId);
    }

    public Book saveBook (final Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(final Long id){
        bookRepository.deleteById(id);
    }
}
