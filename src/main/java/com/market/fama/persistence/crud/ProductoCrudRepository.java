package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //List<Producto> findBySubcategoria(int idSubcategoria);

    //List<Producto> findBySubmarca(int idSubmarca);

}
