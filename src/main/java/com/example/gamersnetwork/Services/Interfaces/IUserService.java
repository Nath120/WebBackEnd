package com.example.gamersnetwork.Services.Interfaces;
import com.example.gamersnetwork.Models.DTO.UserDTO;
import com.example.gamersnetwork.Models.Entities.User;

import java.util.List;

public interface IUserService {
    User create(UserDTO user);

    List<User> readAll();

    User findByUsername(String username);
}
