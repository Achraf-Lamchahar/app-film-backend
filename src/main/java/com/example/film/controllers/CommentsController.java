package com.example.film.controllers;

import com.example.film.entities.Comments;
import com.example.film.repositories.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5000")
@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private CommentsRepo commentsRepo;


    @GetMapping
    public List<Comments> getComments(){
        return commentsRepo.findAll();
    }

    @GetMapping("{id}")
    public Comments getComment(@PathVariable("id") Long id){
        return commentsRepo.findById(id).orElse(null);
    }

    @PostMapping
    public Comments save(@RequestBody Comments comments){
        return commentsRepo.save(comments);
    }

    @DeleteMapping("{id}")
    public boolean remove(@PathVariable("id") Long id){
        commentsRepo.deleteById(id);
        return true;
    }

    @PutMapping("{id}")
    public Comments update(@PathVariable Long id, @RequestBody Comments comments){
        comments.setId(id);
        return commentsRepo.save(comments);
    }
}
