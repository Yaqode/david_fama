package com.market.fama.domain.repository;

import com.market.fama.domain.Subbrand;

import java.util.List;
import java.util.Optional;

public interface SubbrandRepository {
    List<Subbrand> getAll();
    Optional<Subbrand> getSubbrand(int subbrandId);
    Subbrand save(Subbrand subbrand);
    void delete(int subbrandId);
}
