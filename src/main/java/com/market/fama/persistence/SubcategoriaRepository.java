package com.market.fama.persistence;

import com.market.fama.persistence.crud.SubcategoriaCrudRepository;
import com.market.fama.persistence.entity.Subcategoria;
import com.market.fama.persistence.entity.Subcategoria;

import java.util.List;
import java.util.Optional;

public class SubcategoriaRepository {
    private SubcategoriaCrudRepository subcategoriaCrudRepository;

    public List<Subcategoria> getAll(){
        return (List<Subcategoria>) subcategoriaCrudRepository.findAll();
    }

    public Optional<Subcategoria> getCategoria(int idSubcategoria) { return subcategoriaCrudRepository.findById(idSubcategoria); }

    public Subcategoria save(Subcategoria categoria) { return  subcategoriaCrudRepository.save(categoria); }

    public void delete(int idSubcategoria) { subcategoriaCrudRepository.deleteById(idSubcategoria); }
}
