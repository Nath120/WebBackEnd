package com.example.gamersnetwork.Services;

import com.example.gamersnetwork.IRepositories.IUserRepository;
import com.example.gamersnetwork.Models.DTO.UserDTO;
import com.example.gamersnetwork.Models.Entities.User;
import com.example.gamersnetwork.Services.Interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final IUserRepository usersRepository;

    @Autowired
    public UserService(IUserRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public User create(UserDTO user) {
        User newUser = new User();

        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());
        newUser.setPhonenumber(user.getPhonenumber());

        return usersRepository.save(newUser);
    }

    @Override
    public List<User> readAll() {
        return this.usersRepository.findAllUsers();
    }

    @Override
    public User findByUsername(String username) {
        return this.usersRepository.findUserByUsername(username).get(0);
    }
}
