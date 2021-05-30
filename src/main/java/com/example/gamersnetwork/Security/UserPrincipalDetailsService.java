package com.example.gamersnetwork.Security;

import com.example.gamersnetwork.IRepositories.IUserRepository;
import com.example.gamersnetwork.Models.Entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {
    private final IUserRepository userRepository;

    public UserPrincipalDetailsService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepository.findUserByUsername(s).get(0);
                //.orElseThrow(() -> new UsernameNotFoundException("User login not found"));
        return new UserPrincipal(user);
    }
}
