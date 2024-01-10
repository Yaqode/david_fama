package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Direccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DireccionCrudRepository extends CrudRepository<Direccion, Integer> {
    List<Direccion> findByIdUsuario(int userId);
}
