package com.example.gamersnetwork.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String username;
    private String password;
    private String email;
    private String phonenumber;
    private String role;
    private String permission;
    private boolean is_account_non_expired;
    private boolean is_account_non_locked;
    private boolean is_active;
    private boolean is_credentials_non_expired;
}
