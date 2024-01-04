package com.market.fama.domain.service;

import com.market.fama.domain.Person;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository PersonRepository;

    private UtilService utilService;

    public List<Person> getAll() {
        return PersonRepository.getAll();
    }

    public Optional<Person> getPerson(int PersonId) {
        return PersonRepository.getPerson(PersonId);
    }

    public Person save(Person Person) {
        return PersonRepository.save(Person);
    }

    public boolean delete(int PersonId) {
        return getPerson(PersonId).map(Person -> {
            PersonRepository.delete(PersonId);
            return true;
        }).orElse(false);
    }

}
