package com.example.gamersnetwork.IRepositories;
import com.example.gamersnetwork.Models.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {
    List<User> findAllUsers();

    List<User> findUserByUsername(String username);
}
