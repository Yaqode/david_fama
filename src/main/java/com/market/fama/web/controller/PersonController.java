package com.market.fama.web.controller;

import com.market.fama.domain.Family;
import com.market.fama.domain.Person;
import com.market.fama.domain.service.FamilyService;
import com.market.fama.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping("/{personId}")
    public Optional<Person> getPerson(@PathVariable("personId") int personId) {
        return personService.getPerson(personId);
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int personId) {
        return personService.delete(personId);
    }
}