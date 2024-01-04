package com.market.fama.persistence;

import com.market.fama.domain.User;
import com.market.fama.domain.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UsuarioRepository implements UserRepository {
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public Optional<User> getUser(int userId) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int userId) {

    }
}
