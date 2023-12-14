package com.market.fama.domain.repository;

import com.market.fama.domain.Family;

import java.util.List;
import java.util.Optional;

public interface FamilyRepository {
    List<Family> getAll();
    Optional<Family> getFamily(int familyId);
    Family save(Family family);
    void delete(int familyId);
}
