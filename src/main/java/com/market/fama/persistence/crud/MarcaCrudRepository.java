package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Marca;
import com.market.fama.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MarcaCrudRepository extends CrudRepository<Marca, Integer> {

}
