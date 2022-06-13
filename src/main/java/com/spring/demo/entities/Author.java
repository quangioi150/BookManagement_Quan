package com.spring.demo.entities;

import com.spring.demo.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "author")
public class Author extends BaseEntity {
    @Id
    private String id;
    private String authorName;
    private String birthDate;
    private Double phoneName;
    private String email;
    private List<Book> bookList;

    public Author(String id, String authorName, String birthDate, Double phoneName, String email, List<Book> bookList) {
        this.id = id;
        this.authorName = authorName;
        this.birthDate = birthDate;
        this.phoneName = phoneName;
        this.email = email;
        this.bookList = bookList;
    }

    public Author() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Double getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(Double phoneName) {
        this.phoneName = phoneName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
