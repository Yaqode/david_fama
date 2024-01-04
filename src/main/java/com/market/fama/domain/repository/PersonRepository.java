package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> getAll();
    Optional<Person> getPerson(int personId);
    Person save(Person person);
    void delete(int personId);
}
