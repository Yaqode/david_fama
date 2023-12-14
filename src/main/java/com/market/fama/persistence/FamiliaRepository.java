package com.market.fama.persistence;

import com.market.fama.domain.Category;
import com.market.fama.domain.Family;
import com.market.fama.domain.repository.FamilyRepository;
import com.market.fama.persistence.crud.FamiliaCrudRepository;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Familia;
import com.market.fama.persistence.mapper.CategoryMapper;
import com.market.fama.persistence.mapper.FamilyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FamiliaRepository implements FamilyRepository {
    @Autowired
    private FamiliaCrudRepository familiaCrudRepository;
    @Autowired
    private FamilyMapper mapper;

    @Override
    public List<Family> getAll(){
        List<Familia> categorias = (List<Familia>) familiaCrudRepository.findAll();
        return mapper.toFamilies(categorias);
    }

    @Override
    public Optional<Family> getFamily(int familyId) {
        return familiaCrudRepository.findById(familyId).map(familia -> mapper.toFamily(familia));
    }

    @Override
    public Family save(Family family) {
        Familia familia = mapper.toFamilia(family);
        return mapper.toFamily(familiaCrudRepository.save(familia));
    }

    @Override
    public void delete(int familyId) { familiaCrudRepository.deleteById(familyId); }
}