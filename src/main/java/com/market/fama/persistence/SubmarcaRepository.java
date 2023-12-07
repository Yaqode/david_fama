package com.market.fama.persistence;

import com.market.fama.persistence.crud.SubmarcaCrudRepository;
import com.market.fama.persistence.entity.Submarca;
import com.market.fama.persistence.entity.Submarca;

import java.util.List;
import java.util.Optional;

public class SubmarcaRepository {
    private SubmarcaCrudRepository submarcaCrudRepository;

    public List<Submarca> getAll(){
        return (List<Submarca>) submarcaCrudRepository.findAll();
    }

    public Optional<Submarca> getCategoria(int idSubmarca) { return submarcaCrudRepository.findById(idSubmarca); }

    public Submarca save(Submarca categoria) { return  submarcaCrudRepository.save(categoria); }

    public void delete(int idSubmarca) { submarcaCrudRepository.deleteById(idSubmarca); }
}
