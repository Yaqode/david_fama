package com.market.fama.persistence;

import com.market.fama.domain.Category;
import com.market.fama.domain.repository.CategoryRepository;
import com.market.fama.persistence.crud.CategoriaCrudRepository;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository implements CategoryRepository {
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;
    @Autowired
    private CategoryMapper mapper;

    public List<Category> getAll(){
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategories(categorias);
    }

    public Optional<Category> getCategory(int categoryId) {
        return categoriaCrudRepository.findById(categoryId).map(categoria -> mapper.toCategory(categoria));
    }

    public Category save(Category category) {
        Categoria categoria = mapper.toCategoria(category);
        return mapper.toCategory(categoriaCrudRepository.save(categoria));
    }

    public void delete(int categoryId) {
        categoriaCrudRepository.deleteById(categoryId);
    }
}
