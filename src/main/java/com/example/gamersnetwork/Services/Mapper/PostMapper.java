package com.example.gamersnetwork.Services.Mapper;

import com.example.gamersnetwork.Models.DTO.PostDTO;
import com.example.gamersnetwork.Models.Entities.Post;
import org.springframework.stereotype.Service;

@Service
public class PostMapper implements EntityMapper<Post, PostDTO> {
    @Override
    public PostDTO entitytoDto(Post post) {
        return new PostDTO(
                post.getId(),
                post.getMessage(),
                post.getLikes()
        );
    }
}