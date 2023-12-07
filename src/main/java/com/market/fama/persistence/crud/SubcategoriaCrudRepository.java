package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Producto;
import com.market.fama.persistence.entity.Subcategoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubcategoriaCrudRepository extends CrudRepository<Subcategoria, Integer> {

}
