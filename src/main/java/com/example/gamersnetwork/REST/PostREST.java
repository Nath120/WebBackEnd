package com.example.gamersnetwork.REST;

import com.example.gamersnetwork.Models.DTO.PostDTO;
import com.example.gamersnetwork.Models.DTO.UserDTO;
import com.example.gamersnetwork.Models.Entities.Post;
import com.example.gamersnetwork.Services.Mapper.EntityMapper;
import com.example.gamersnetwork.Services.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/post")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080", "https://colval-network.herokuapp.com"})
public class PostREST {

    private final PostService postService;
    private final EntityMapper<Post, PostDTO> mapper;
    private final Logger log = LoggerFactory.getLogger(PostREST.class);

    public PostREST(PostService postService, EntityMapper<Post, PostDTO> mapper){
        this.postService = postService;
        this.mapper = mapper;
    }

    @GetMapping("/getAll")
    public List<PostDTO> getAll(){
        return this.postService.readAll().stream().map(mapper::entitytoDto).collect(Collectors.toList());
    }


    @RequestMapping(value = "/createPost")
    public void createPost(@RequestBody PostDTO postDTO) {
        postService.create(postDTO);
    }


    @DeleteMapping(value = "/deletePost")
    public void deletePost(@RequestBody Long id) {
        Post post = this.postService.findById(id);
        this.postService.delete(post);
    }



}
