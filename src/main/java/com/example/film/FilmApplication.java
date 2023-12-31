package com.example.film;

import com.example.film.entities.Comments;
import com.example.film.repositories.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmApplication implements CommandLineRunner {

    @Autowired
    private CommentsRepo commentsRepo;

    public static void main(String[] args) {
        SpringApplication.run(FilmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commentsRepo.save(new Comments("This part is much better than the previous one!"));
        commentsRepo.save(new Comments("I liked this movie so much"));
        commentsRepo.save(new Comments("Finally, the story continues"));
        commentsRepo.findAll().forEach(c -> {
            System.out.println(c.getText());
        });
    }
}
