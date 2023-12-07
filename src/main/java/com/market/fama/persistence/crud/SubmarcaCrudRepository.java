package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Producto;
import com.market.fama.persistence.entity.Submarca;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubmarcaCrudRepository extends CrudRepository<Submarca, Integer> {

}
