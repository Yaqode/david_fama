package com.market.fama.domain.repository;

import com.market.fama.domain.Profile;

import java.util.List;
import java.util.Optional;

public interface ProfileRepository {
    List<Profile> getAll();
    Optional<Profile> getProfile(int profileId);
    Profile save(Profile profile);
    void delete(int profileId);
}
