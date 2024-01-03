package com.example.film.entities;

import jakarta.persistence.*;
import java.util.List;

    @Entity
    public class Movie {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // other movie fields


        public Movie() {
        }

        // getters and setters
    }
