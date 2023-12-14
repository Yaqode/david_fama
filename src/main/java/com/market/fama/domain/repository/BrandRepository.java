package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandRepository {
    List<Brand> getAll();
    Optional<Brand> getBrand(int brandId);
    Brand save(Brand brand);
    void delete(int brandId);
}
