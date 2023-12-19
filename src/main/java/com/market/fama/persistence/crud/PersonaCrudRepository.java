package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrudRepository extends CrudRepository<Persona, Integer> {
}
