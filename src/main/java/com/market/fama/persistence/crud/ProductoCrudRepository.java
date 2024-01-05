package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdSubmarca(int idSubmarca);
    List<Producto> findByIdSubcategoria(int idSubcategoria);
    List<Producto> findBySubmarcaIdMarca(int idMarca);
    List<Producto> findBySubcategoriaIdCategoria(int idCategoria);
    List<Producto> findBySubcategoriaCategoriaIdFamilia(int idFamilia);
}
