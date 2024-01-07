package com.market.fama.domain.service;

import com.market.fama.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSecurityService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserSecurityService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.market.fama.domain.User user = this.userRepository.findByCorreoUsuario(username);

        if (user.getUserId() != 0){
            return User.builder()
                    .username(String.valueOf(user.getUserEmail()))
                    .password(user.getUserPassword())
                    .roles(String.valueOf(user.getProfileId()))
                    .build();
        } else {
            throw new UsernameNotFoundException("User " + username + " not found.");
        }

    }
}
