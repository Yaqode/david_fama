package com.market.fama.persistence;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Category;
import com.market.fama.domain.repository.BrandRepository;
import com.market.fama.domain.repository.CategoryRepository;
import com.market.fama.persistence.crud.CategoriaCrudRepository;
import com.market.fama.persistence.crud.MarcaCrudRepository;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Marca;
import com.market.fama.persistence.entity.Marca;
import com.market.fama.persistence.mapper.BrandMapper;
import com.market.fama.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MarcaRepository implements BrandRepository {
    @Autowired
    private MarcaCrudRepository marcaCrudRepository;
    @Autowired
    private BrandMapper mapper;

    @Override
    public List<Brand> getAll(){
        List<Marca> marcas = (List<Marca>) marcaCrudRepository.findAll();
        return mapper.toBrands(marcas);
    }

    @Override
    public Optional<Brand> getBrand(int categoryId) {
        return marcaCrudRepository.findById(categoryId).map(categoria -> mapper.toBrand(categoria));
    }

    @Override
    public Brand save(Brand brand) {
        Marca marca = mapper.toMarca(brand);
        return mapper.toBrand(marcaCrudRepository.save(marca));
    }

    @Override
    public void delete(int brandId) { marcaCrudRepository.deleteById(brandId); }
}