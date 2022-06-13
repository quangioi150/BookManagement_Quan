package com.spring.demo.controller;

import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Author;
import com.spring.demo.entities.Book;
import com.spring.demo.services.AuthorServiceImpl;
import com.spring.demo.services.AuthorServices;
import com.spring.demo.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AuthorController {
    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> get() {
        return ResponseEntity.ok().body(authorService.findAllAuthor());
    }

    @PostMapping("/createAuthor")
    public ResponseEntity<AuthorDTO> create(@RequestBody AuthorDTO authorDTO) {
        AuthorDTO author = authorService.createAuthor(authorDTO);
        return ResponseEntity.ok().body(author);
    }

    @DeleteMapping("/authors/{id}")
    public void deleteAuthorById(@PathVariable("id") String id) {
        authorService.deleteAuthorById(id);
    }

    @PutMapping("/authors/{id}")
    public ResponseEntity<Author> UpdateById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(authorService.updateById(id));
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Optional<Author>> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(authorService.findById(id));
    }
}
