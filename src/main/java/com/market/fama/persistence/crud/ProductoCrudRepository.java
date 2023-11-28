package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdproducto(int idProducto);
    List<Producto> findByIdSubcategoria(int idSubcategoria);
    List<Producto> findByIdSubmarca(int idSubmarca);
}
