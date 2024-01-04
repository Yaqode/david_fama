package com.market.fama.persistence;

import com.market.fama.domain.Category;
import com.market.fama.domain.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

public class ColoniaRepository implements CategoryRepository {
    @Override
    public List<Category> getAll() {
        return null;
    }

    @Override
    public Optional<Category> getCategory(int categoryId) {
        return Optional.empty();
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void delete(int categoryId) {

    }
}
