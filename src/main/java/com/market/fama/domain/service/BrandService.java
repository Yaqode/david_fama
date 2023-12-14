package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

    public Optional<Brand> getBrand(int brandId) {
        return brandRepository.getBrand(brandId);
    }

    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    public boolean delete(int brandId) {
        return getBrand(brandId).map(brand -> {
            brandRepository.delete(brandId);
            return true;
        }).orElse(false);
    }

}
