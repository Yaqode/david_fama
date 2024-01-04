package com.market.fama.persistence;

import com.market.fama.domain.Category;
import com.market.fama.domain.Colony;
import com.market.fama.domain.repository.CategoryRepository;
import com.market.fama.domain.repository.ColonyRepository;
import com.market.fama.persistence.crud.CategoriaCrudRepository;
import com.market.fama.persistence.crud.ColoniaCrudRepository;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.mapper.CategoryMapper;
import com.market.fama.persistence.mapper.ColoniaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ColoniaRepository implements ColonyRepository {

    @Autowired
    private ColoniaCrudRepository coloniaCrudRepository;
    @Autowired
    private ColoniaMapper mapper;

    @Override
    public List<Colony> getAll(){
        List<Colonia> colonias = (List<Colonia>) coloniaCrudRepository.findAll();
        return mapper.toColony(colonias);
    }

    @Override
    public Optional<Colony> getColony(int colonyId) {
        return coloniaCrudRepository.findById(colonyId).map(colonia -> mapper.toColony(colonia));
    }

    @Override
    public Colony save(Colony colony) {
        Colonia colonia = mapper.toColonia(colony);
        return mapper.toColony(coloniaCrudRepository.save(colonia));
    }

    @Override
    public void delete(int categoryId) {
        coloniaCrudRepository.deleteById(categoryId);
    }
}