package com.market.fama.persistence;

import com.market.fama.persistence.crud.MarcaCrudRepository;
import com.market.fama.persistence.entity.Marca;
import com.market.fama.persistence.entity.Marca;

import java.util.List;
import java.util.Optional;

public class MarcaRepository {
    private MarcaCrudRepository marcaCrudRepository;

    public List<Marca> getAll(){
        return (List<Marca>) marcaCrudRepository.findAll();
    }
    
    public Optional<Marca> getCategoria(int idMarca) { return marcaCrudRepository.findById(idMarca); }

    public Marca save(Marca categoria) { return  marcaCrudRepository.save(categoria); }

    public void delete(int idMarca) { marcaCrudRepository.deleteById(idMarca); }
}
