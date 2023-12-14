package com.market.fama.domain.repository;

import com.market.fama.domain.Subcategory;

import java.util.List;
import java.util.Optional;

public interface SubcategoryRepository {
    List<Subcategory> getAll();
    Optional<Subcategory> getSubcategory(int subcategoryId);
    Subcategory save(Subcategory subcategory);
    void delete(int subcategoryId);
}
