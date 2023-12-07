package com.market.fama.persistence;

import com.market.fama.persistence.crud.CategoriaCrudRepository;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {
    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    public Optional<Categoria> getCategoria(int idCategoria) { return categoriaCrudRepository.findById(idCategoria); }

    public Categoria save(Categoria categoria) { return  categoriaCrudRepository.save(categoria); }

    public void delete(int idCategoria) { categoriaCrudRepository.deleteById(idCategoria); }
}
