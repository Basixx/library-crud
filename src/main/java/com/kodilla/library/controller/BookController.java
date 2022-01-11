package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.Book;
import com.kodilla.library.domain.reader.BookDto;
import com.kodilla.library.mapper.BookMapper;
import com.kodilla.library.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class BookController {

    private final DbService service;
    private final BookMapper bookMapper;


    @GetMapping(value = "getBooks")
    public List<BookDto> getBooks(){
        List<Book> books = service.getAllBooks();
        return bookMapper.mapToBookDtoList(books);
    }

    @GetMapping(name = "getBook")
    public BookDto getBook(Long bookId){
        return new BookDto(1L, "Book1", "Author1", 2003);
    }

    @DeleteMapping(value = "deleteBook")
    public void deleteBook(Long bookId){

    }

    @PutMapping(value = "updateBook")
    public BookDto updateBook (BookDto bookDto){
        return new BookDto(1L, "Book1 edited", "Author edited", 2004);
    }

    @PostMapping(value = "createBook")
    public void createReader(BookDto bookDto){

    }
}
