package com.example.film.repositories;

import com.example.film.entities.Comments;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comments,Long> {


}
