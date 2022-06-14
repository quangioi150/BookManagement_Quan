package com.spring.demo.controller;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import com.spring.demo.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> get() {
        return ResponseEntity.ok().body(bookService.findAllBook());
    }

    @PostMapping("/createBook")
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        BookDTO book = bookService.createBook(bookDTO);
        return ResponseEntity.ok().body(book);
    }

    @RequestMapping(value = "books/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteBookById(@PathVariable String id) {
       bookService.deleteBookById(id);
        return "delete successfull";
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(bookService.updateById(id));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Optional<Book>> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(bookService.findById(id));
    }
}
