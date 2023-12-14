package com.market.fama.persistence;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Subbrand;
import com.market.fama.domain.Subcategory;
import com.market.fama.domain.repository.SubcategoryRepository;
import com.market.fama.persistence.crud.SubcategoriaCrudRepository;
import com.market.fama.persistence.entity.Marca;
import com.market.fama.persistence.entity.Subcategoria;
import com.market.fama.persistence.mapper.SubcategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SubcategoriaRepository implements SubcategoryRepository {
    @Autowired
    private SubcategoriaCrudRepository subcategoriaCrudRepository;
    @Autowired
    private SubcategoryMapper mapper;

    @Override
    public List<Subcategory> getAll(){
        List<Subcategoria> subcategorias = (List<Subcategoria>) subcategoriaCrudRepository.findAll();
        return mapper.toSubcategories(subcategorias);
    }

    @Override
    public Optional<Subcategory> getSubcategory(int subcategoryId) {
        return subcategoriaCrudRepository.findById(subcategoryId).map(subcategoria -> mapper.toSubcategory(subcategoria));
    }

    @Override
    public Subcategory save(Subcategory subcategory) {
        Subcategoria subcategoria = mapper.toSubcategoria(subcategory);
        return mapper.toSubcategory(subcategoriaCrudRepository.save(subcategoria));
    }

    @Override
    public void delete(int subcategoryId) { subcategoriaCrudRepository.deleteById(subcategoryId); }
}
