package com.example.gamersnetwork.Services.Mapper;
import com.example.gamersnetwork.Models.DTO.UserDTO;
import com.example.gamersnetwork.Models.Entities.User;
import org.springframework.stereotype.Service;

@Service
public class UsersMapper implements EntityMapper<User, UserDTO> {

    @Override
    public UserDTO entitytoDto(User users) {
        return new UserDTO(
                users.getUsername(),
                users.getPassword(),
                users.getEmail(),
                users.getPhonenumber(),
                users.getRole(),
                users.getPermission(),
                users.isIs_account_non_expired(),
                users.isIs_account_non_locked(),
                users.isIs_active(),
                users.isIs_credentials_non_expired()
        );
    }
}
