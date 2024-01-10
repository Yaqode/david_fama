package com.market.fama.domain.service;

import com.market.fama.domain.User;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;

    private UtilService utilService;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<User> getAll() {
        return UserRepository.getAll();
    }

    public Optional<User> getUser(int UserId) {
        Optional<User> user = UserRepository.getUser(UserId);
        user.ifPresent(user1 -> {
            user1.setUserPassword("---Error---");
        });
        return user;
    }

    public User getUserByEmail(String UserId) {
        User user = UserRepository.findByCorreoUsuario(UserId);
        user.setUserPassword("");
        return user;
    }

    public User save(User User) {
        System.out.println("Algo sucede " + User.getUserPassword());
        logger.info("Algo sucede " + User.getUserPassword());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(User.getUserPassword().toString());
        logger.info("Algo sucede " + hashedPassword);
        User.setUserPassword(hashedPassword);
        System.out.println("Algo sucede " + User.getUserPassword());
        logger.info("Algo sucede " + User.getUserPassword());
        return UserRepository.save(User);
    }

    public boolean delete(int UserId) {
        return getUser(UserId).map(User -> {
            UserRepository.delete(UserId);
            return true;
        }).orElse(false);
    }

}
