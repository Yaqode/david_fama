package com.market.fama.persistence;

import com.market.fama.persistence.crud.ProductoCrudRepository;
import com.market.fama.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }


    public List<Producto> getBySubmarca(int idSubmarca){
        return productoCrudRepository.findByIdSubmarca(idSubmarca);
    }

    public List<Producto>getBySubcategoria(int idSubcategoria){
        return productoCrudRepository.findByIdSubcategoria(idSubcategoria);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
