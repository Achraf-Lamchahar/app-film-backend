//package com.example.film.entities;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Favoris {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "movie_id")
//    private Movie movie;
//
//    // Constructors, getters, setters
//
//
//    public Favoris(User user, Movie movie) {
//        this.user = user;
//        this.movie = movie;
//    }
//
//    public Favoris() {
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
//}

