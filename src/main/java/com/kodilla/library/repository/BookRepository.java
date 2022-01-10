package com.kodilla.library.repository;

import com.kodilla.library.domain.reader.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository <Book, Long> {
    List<Book> findAll();
}
