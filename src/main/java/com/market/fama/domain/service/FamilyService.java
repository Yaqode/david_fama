package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Family;
import com.market.fama.domain.repository.BrandRepository;
import com.market.fama.domain.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {
    @Autowired
    private FamilyRepository familyRepository;

    public List<Family> getAll() {
        return familyRepository.getAll();
    }

    public Optional<Family> getFamily(int familyId) {
        return familyRepository.getFamily(familyId);
    }

    public Family save(Family family) {
        return familyRepository.save(family);
    }

    public boolean delete(int familyId) {
        return getFamily(familyId).map(family -> {
            familyRepository.delete(familyId);
            return true;
        }).orElse(false);
    }
}
