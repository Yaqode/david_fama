package com.market.fama.persistence;

import com.market.fama.persistence.crud.FamiliaCrudRepository;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Familia;

import java.util.List;
import java.util.Optional;

public class FamiliaRepository {
    private FamiliaCrudRepository familiaCrudRepository;

    public List<Familia> getAll(){
        return (List<Familia>) familiaCrudRepository.findAll();
    }

    public Optional<Familia> getCategoria(int idFamilia) { return familiaCrudRepository.findById(idFamilia); }

    public Familia save(Familia categoria) { return  familiaCrudRepository.save(categoria); }

    public void delete(int idFamilia) { familiaCrudRepository.deleteById(idFamilia); }
}
