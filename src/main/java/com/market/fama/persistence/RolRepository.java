package com.market.fama.persistence;

import com.market.fama.domain.Profile;
import com.market.fama.domain.repository.ProfileRepository;

import java.util.List;
import java.util.Optional;

public class RolRepository implements ProfileRepository {
    @Override
    public List<Profile> getAll() {
        return null;
    }

    @Override
    public Optional<Profile> getProfile(int profileId) {
        return Optional.empty();
    }

    @Override
    public Profile save(Profile profile) {
        return null;
    }

    @Override
    public void delete(int profileId) {

    }
}
