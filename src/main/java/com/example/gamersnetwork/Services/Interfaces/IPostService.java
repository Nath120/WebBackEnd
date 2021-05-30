package com.example.gamersnetwork.Services.Interfaces;

import com.example.gamersnetwork.Models.DTO.PostDTO;
import com.example.gamersnetwork.Models.Entities.Post;

import java.util.List;

public interface IPostService {

    Post create(PostDTO post);

    List<Post> readAll();

    void delete(Post post);

    Post findById(Long id);
}
