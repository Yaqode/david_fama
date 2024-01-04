package com.market.fama.domain.service;

import com.market.fama.domain.Profile;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository ProfileRepository;

    private UtilService utilService;

    public List<Profile> getAll() {
        return ProfileRepository.getAll();
    }

    public Optional<Profile> getProfile(int ProfileId) {
        return ProfileRepository.getProfile(ProfileId);
    }

    public Profile save(Profile Profile) {
        return ProfileRepository.save(Profile);
    }

    public boolean delete(int ProfileId) {
        return getProfile(ProfileId).map(Profile -> {
            ProfileRepository.delete(ProfileId);
            return true;
        }).orElse(false);
    }

}
