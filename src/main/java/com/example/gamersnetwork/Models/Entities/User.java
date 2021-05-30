package com.example.gamersnetwork.Models.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = "User.findAllUsers", query = "SELECT a FROM User a"),
        @NamedQuery(name = "User.findUserByUsername", query = "SELECT a FROM User a WHERE a.username =:username")
})
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenumber")
    private String phonenumber;

    @Column(name = "role")
    private String role;

    @Column(name = "permission")
    private String permission;

    @Column(name = "is_account_non_expired")
    private boolean is_account_non_expired;

    @Column(name = "is_account_non_locked")
    private boolean is_account_non_locked;

    @Column(name = "is_active")
    private boolean is_active;

    @Column(name = "is_credentials_non_expired")
    private boolean is_credentials_non_expired;

    public List<String> getRolesList() {
        if (this.role != null){
            if (this.role.length() > 0) {
                return Arrays.asList(this.role.split(","));
            }
        }
        return new ArrayList<>();
    }

    public List<String> getPermissionsList() {
        if (this.permission != null){
            if (this.permission.length() > 0) {
                return Arrays.asList(this.permission.split(","));
            }
        }
        return new ArrayList<>();
    }



    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public boolean isIs_account_non_expired() {
        return is_account_non_expired;
    }

    public void setIs_account_non_expired(boolean is_account_non_expired) {
        this.is_account_non_expired = is_account_non_expired;
    }

    public boolean isIs_account_non_locked() {
        return is_account_non_locked;
    }

    public void setIs_account_non_locked(boolean is_account_non_locked) {
        this.is_account_non_locked = is_account_non_locked;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public boolean isIs_credentials_non_expired() {
        return is_credentials_non_expired;
    }

    public void setIs_credentials_non_expired(boolean is_credentials_non_expired) {
        this.is_credentials_non_expired = is_credentials_non_expired;
    }
}
