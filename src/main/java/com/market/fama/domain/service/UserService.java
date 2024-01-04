package com.market.fama.domain.service;

import com.market.fama.domain.User;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<User> getAll() {
        return UserRepository.getAll();
    }

    public Optional<User> getUser(int UserId) {
        return UserRepository.getUser(UserId);
    }

    public User save(User User) {
        return UserRepository.save(User);
    }

    public boolean delete(int UserId) {
        return getUser(UserId).map(User -> {
            UserRepository.delete(UserId);
            return true;
        }).orElse(false);
    }

}
