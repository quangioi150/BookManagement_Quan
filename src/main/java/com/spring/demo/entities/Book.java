package com.spring.demo.entities;

import com.spring.demo.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book extends BaseEntity {
    @Id
    private String id;
    private String title;
    private String content;
    private String bookName;
    private String description;
    private String authorName;
public Book(){

}

    public Book(String id, String title, String content, String bookName, String description, String authorName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.bookName = bookName;
        this.description = description;
        this.authorName = authorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
