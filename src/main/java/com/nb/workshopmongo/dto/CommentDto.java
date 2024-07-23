package com.nb.workshopmongo.dto;

import java.util.Date;

public class CommentDto {

    private String text;
    private Date date;
    private AuthorDto author;


    public CommentDto() {
    }

    public CommentDto(String text, Date date, AuthorDto author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDto getAuthor() {
        return this.author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }

}
