package com.spring.demo.services;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookServices {
    BookDTO createBook(BookDTO bookDTO);

    Book updateBook(BookDTO bookDTO);

    List<Book> findAllBook();

    public void deleteBookById(String id);

    Book updateById(String id);

    Optional<Book> findById(String Id);
}
