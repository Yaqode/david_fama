package com.market.fama.web.controller;

import com.market.fama.domain.Family;
import com.market.fama.domain.Profile;
import com.market.fama.domain.service.FamilyService;
import com.market.fama.domain.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/all")
    public List<Profile> getAll() {
        return profileService.getAll();
    }

    @GetMapping("/{profileId}")
    public Optional<Profile> getProfile(@PathVariable("familyId") int profileId) {
        return profileService.getProfile(profileId);
    }

    @PostMapping("/save")
    public Profile save(@RequestBody Profile profile) {
        return profileService.save(profile);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int profileId) {
        return profileService.delete(profileId);
    }
}