package com.example.film.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    public Comments(String text) {
        this.text = text;
    }

    public Comments() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
