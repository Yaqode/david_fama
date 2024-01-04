package com.market.fama.persistence;

import com.market.fama.domain.Person;
import com.market.fama.domain.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

public class PersonaRepository implements PersonRepository {
    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public Optional<Person> getPerson(int personId) {
        return Optional.empty();
    }

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public void delete(int personId) {

    }
}
