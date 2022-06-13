package com.spring.demo.services;

import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorServices {
    AuthorDTO createAuthor(AuthorDTO authorDTO);

    Author updateAuthor(AuthorDTO authorDTO);

    List<Author> findAllAuthor();

    void deleteAuthorById(String id);

    Optional<Author> findById(String id);

    Author updateById(String id);
}
