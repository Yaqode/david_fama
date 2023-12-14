package com.market.fama.persistence;

import com.market.fama.domain.Subbrand;
import com.market.fama.domain.repository.SubbrandRepository;
import com.market.fama.persistence.crud.SubmarcaCrudRepository;
import com.market.fama.persistence.entity.Submarca;
import com.market.fama.persistence.entity.Submarca;
import com.market.fama.persistence.mapper.SubbrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SubmarcaRepository implements SubbrandRepository {
    @Autowired
    private SubmarcaCrudRepository submarcaCrudRepository;
    @Autowired
    private SubbrandMapper mapper;

    @Override
    public List<Subbrand> getAll(){
        List<Submarca> subcategorias = (List<Submarca>) submarcaCrudRepository.findAll();
        return mapper.toSubbrands(subcategorias);
    }

    @Override
    public Optional<Subbrand> getSubbrand(int subbrandId) {
        return submarcaCrudRepository.findById(subbrandId).map(submarca -> mapper.toSubbrand(submarca));
    }

    @Override
    public Subbrand save(Subbrand subbrand) {
        Submarca subcategoria = mapper.toSubmarca(subbrand);
        return mapper.toSubbrand(submarcaCrudRepository.save(subcategoria));
    }

    @Override
    public void delete(int idSubmarca) { submarcaCrudRepository.deleteById(idSubmarca); }
}