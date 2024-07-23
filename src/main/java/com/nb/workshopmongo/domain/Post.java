package com.nb.workshopmongo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nb.workshopmongo.dto.AuthorDto;
import com.nb.workshopmongo.dto.CommentDto;

@Document
public class Post {

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDto author;

    private List<CommentDto> comments = new ArrayList<>();
    
    public Post(){}

    public Post(String id, Date date, String title, String body, AuthorDto author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AuthorDto getAuthor() {
        return this.author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }
    

    public List<CommentDto> getComments() {
        return this.comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }

}
