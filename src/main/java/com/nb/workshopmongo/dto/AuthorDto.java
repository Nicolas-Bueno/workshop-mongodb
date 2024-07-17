package com.nb.workshopmongo.dto;

import com.nb.workshopmongo.domain.User;

public class AuthorDto {

    private String id;
    private String name;

    public AuthorDto(){}
    
    public AuthorDto(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}    
