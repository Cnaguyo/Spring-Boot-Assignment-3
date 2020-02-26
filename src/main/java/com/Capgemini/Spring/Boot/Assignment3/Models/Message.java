package com.Capgemini.Spring.Boot.Assignment3.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Message {

    @Id
    @GeneratedValue
    private  Long id;
    @ManyToOne
    private Account account;
    private String content;
    @ManyToOne
    private Topic topic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
