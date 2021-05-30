package com.example.gamersnetwork.REST;


import com.example.gamersnetwork.Models.DTO.UserDTO;
import com.example.gamersnetwork.Models.Entities.User;
import com.example.gamersnetwork.Services.Mapper.EntityMapper;
import com.example.gamersnetwork.Services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/users")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080", "https://colval-network.herokuapp.com"})
public class UserREST {

    private final UserService userService;
    private final EntityMapper<User, UserDTO> mapper;
    private final Logger log = LoggerFactory.getLogger(UserREST.class);

    public UserREST(UserService userService, EntityMapper<User, UserDTO> mapper){
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping("/getAll")
    public List<UserDTO> getAll(){
        return this.userService.readAll().stream().map(mapper::entitytoDto).collect(Collectors.toList());
    }

    @GetMapping("/getByUsername")
    public User getByUsername(String username){
        return this.userService.findByUsername(username);
    }

    @RequestMapping(value = "/createUser")
    public void createUser(@RequestBody UserDTO usersDTO){
        userService.create(usersDTO);
    }


}
