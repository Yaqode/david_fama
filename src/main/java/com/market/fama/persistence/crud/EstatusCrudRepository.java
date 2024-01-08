package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Estatus;
import com.market.fama.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface EstatusCrudRepository extends CrudRepository<Estatus, Integer> {

}