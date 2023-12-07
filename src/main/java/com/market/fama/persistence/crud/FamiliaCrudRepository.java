package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Familia;
import com.market.fama.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FamiliaCrudRepository extends CrudRepository<Familia, Integer> {
}
