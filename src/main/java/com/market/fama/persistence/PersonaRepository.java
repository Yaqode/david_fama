package com.market.fama.persistence;

import com.market.fama.domain.Direction;
import com.market.fama.domain.Person;
import com.market.fama.domain.repository.PersonRepository;
import com.market.fama.persistence.crud.DireccionCrudRepository;
import com.market.fama.persistence.crud.PersonaCrudRepository;
import com.market.fama.persistence.entity.Direccion;
import com.market.fama.persistence.entity.Persona;
import com.market.fama.persistence.mapper.DireccionMapper;
import com.market.fama.persistence.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository implements PersonRepository {

    @Autowired
    private PersonaCrudRepository personaCrudRepository;
    @Autowired
    private PersonaMapper mapper;

    @Override
    public List<Person> getAll() {
        List<Persona> personas = (List<Persona>) personaCrudRepository.findAll();
        return mapper.toPersons(personas);
    }

    @Override
    public Optional<Person> getPerson(int personId) {
        return personaCrudRepository.findById(personId).map(persona -> mapper.tPerson(persona));
    }

    @Override
    public Person save(Person person) {
        Persona persona = mapper.toPersona(person);
        return mapper.tPerson(personaCrudRepository.save(persona));
    }

    @Override
    public void delete(int personId) {
        personaCrudRepository.deleteById(personId);
    }

}
