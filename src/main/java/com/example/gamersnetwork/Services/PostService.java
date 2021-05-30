package com.example.gamersnetwork.Services;

import com.example.gamersnetwork.IRepositories.IPostRepository;
import com.example.gamersnetwork.Models.DTO.PostDTO;
import com.example.gamersnetwork.Models.Entities.Post;
import com.example.gamersnetwork.Services.Interfaces.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {

    private final IPostRepository postRepository;

    @Autowired
    public PostService(IPostRepository postRepository){
        this.postRepository = postRepository;
    }


    @Override
    public Post create(PostDTO post) {
        Post newPost = new Post();
        newPost.setId(Math.toIntExact(this.postRepository.findAllPost().stream().count()) + 1);
        newPost.setMessage(post.getMessage());
        newPost.setLikes(post.getLikes());

        return postRepository.save(newPost);
    }


    @Override
    public List<Post> readAll() {
        return  this.postRepository.findAllPost();
    }



    @Override
    public void delete(Post post) {
       this.postRepository.delete(post);
    }

    @Override
    public Post findById(Long id) {
        return this.postRepository.findById(id).get();
    }


}

