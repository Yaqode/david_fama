package com.market.fama.persistence;

import com.market.fama.domain.Person;
import com.market.fama.domain.Profile;
import com.market.fama.domain.repository.ProfileRepository;
import com.market.fama.persistence.crud.PersonaCrudRepository;
import com.market.fama.persistence.crud.RolCrudRepository;
import com.market.fama.persistence.entity.Persona;
import com.market.fama.persistence.entity.Rol;
import com.market.fama.persistence.mapper.PersonaMapper;
import com.market.fama.persistence.mapper.RolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolRepository implements ProfileRepository {
    @Autowired
    private RolCrudRepository rolCrudRepository;
    @Autowired
    private RolMapper mapper;

    @Override
    public List<Profile> getAll() {
        List<Rol> roles = (List<Rol>) rolCrudRepository.findAll();
        return mapper.toProfiles(roles);
    }

    @Override
    public Optional<Profile> getProfile(int profileId) {
        return rolCrudRepository.findById(profileId).map(rol -> mapper.toProfile(rol));
    }

    @Override
    public Profile save(Profile profile) {
        Rol rol = mapper.toRol(profile);
        return mapper.toProfile(rolCrudRepository.save(rol));
    }

    @Override
    public void delete(int profileId) {
        rolCrudRepository.deleteById(profileId);
    }
}
