package com.spring.demo.services;

import com.spring.demo.dao.AuthorRepository;
import com.spring.demo.dao.BookRepository;
import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Author;
import com.spring.demo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorServices {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public AuthorDTO createAuthor(AuthorDTO authorDTO) {
        Book book = new Book();
        book.setBookName(authorDTO.getAuthorName());
        book.setDescription(authorDTO.getBirthDate());
        book.setTitle(authorDTO.getEmail());
        Author author = new Author();
        author.setId(authorDTO.getAuthorId());
        author.setAuthorName(authorDTO.getAuthorName());
        author.setBirthDate(authorDTO.getBirthDate());
        author.setPhoneName(authorDTO.getPhoneName());
        author.setEmail(authorDTO.getEmail());
        book.setAuthorName(authorDTO.getAuthorName());
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        author.setBookList(bookList);
        bookRepository.save(book);
        authorRepository.save(author);
        return authorDTO;
    }

    @Override
    public Author updateAuthor(AuthorDTO authorDTO) {
        return null;
    }

    @Override
    public List<Author> findAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteAuthorById(String id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author updateById(@PathVariable("id") String id) {
        return authorRepository.save(authorRepository.findById(id).get());
    }

    @Override
    public Optional<Author> findById(@PathVariable("id") String id) {
        return authorRepository.findById(id);
    }
}
