package com.example.film;

import com.example.film.entities.Comments;
import com.example.film.repositories.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class FilmApplication implements CommandLineRunner {

    @Autowired
    private CommentsRepo commentsRepo;

    public static void main(String[] args) {
        SpringApplication.run(FilmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commentsRepo.save(new Comments("I liked this movie so much"));
        commentsRepo.findAll().forEach(c -> {
            System.out.println(c.getText());
        });
    }
}
