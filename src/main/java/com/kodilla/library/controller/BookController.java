package com.kodilla.library.controller;

import com.kodilla.library.controller.exception.BookNotFoundException;
import com.kodilla.library.domain.Book;
import com.kodilla.library.domain.BookDto;
import com.kodilla.library.mapper.BookMapper;
import com.kodilla.library.service.DbServiceBook;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class BookController {

    private final DbServiceBook service;
    private final BookMapper bookMapper;


    @GetMapping(value = "getBooks")
    public List<BookDto> getBooks(){
        List<Book> books = service.getAllBooks();
        return bookMapper.mapToBookDtoList(books);
    }

    @GetMapping(name = "getBook")
    public BookDto getBook(@RequestParam Long bookId) throws BookNotFoundException {
        return bookMapper.mapToBookDto(
                service.getBook(bookId).orElseThrow(BookNotFoundException::new)
        );
    }

    @DeleteMapping(value = "deleteBook")
    public void deleteBook(@RequestParam Long bookId) throws BookNotFoundException{
        service.deleteBook(bookId);
    }

    @PutMapping(value = "updateBook")
    public BookDto updateBook (@RequestBody BookDto bookDto){
        Book book = bookMapper.mapToBook(bookDto);
        Book savedBook = service.saveBook(book);
        return bookMapper.mapToBookDto(savedBook);
    }

    @PostMapping(value = "createBook", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody BookDto bookDto){
        Book book = bookMapper.mapToBook(bookDto);
        service.saveBook(book);
    }
}
