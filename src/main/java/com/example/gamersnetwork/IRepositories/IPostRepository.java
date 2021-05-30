package com.example.gamersnetwork.IRepositories;

import com.example.gamersnetwork.Models.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllPost();
}
