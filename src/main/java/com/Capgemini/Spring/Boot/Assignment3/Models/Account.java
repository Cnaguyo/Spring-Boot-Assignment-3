package com.Capgemini.Spring.Boot.Assignment3.Models;

import javax.persistence.*;

@Entity
public class Account {
     @Id
     @GeneratedValue
    private Long id;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

