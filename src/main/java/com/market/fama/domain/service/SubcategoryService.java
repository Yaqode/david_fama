package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Subcategory;
import com.market.fama.domain.repository.BrandRepository;
import com.market.fama.domain.repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubcategoryService {
    @Autowired
    private SubcategoryRepository subcategoryRepository;

    public List<Subcategory> getAll() {
        return subcategoryRepository.getAll();
    }

    public Optional<Subcategory> getSubcategory(int subcategoryId) {
        return subcategoryRepository.getSubcategory(subcategoryId);
    }

    public Subcategory save(Subcategory subcategory) {
        return subcategoryRepository.save(subcategory);
    }

    public boolean delete(int subcategoryId) {
        return getSubcategory(subcategoryId).map(subcategory -> {
            subcategoryRepository.delete(subcategoryId);
            return true;
        }).orElse(false);
    }
}
