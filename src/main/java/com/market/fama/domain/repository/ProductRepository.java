package com.market.fama.domain.repository;

import com.market.fama.domain.Product;
import com.market.fama.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

    List<Product> findByIdSubmarca(int idSubmarca);
    List<Product> findByIdSubcategoria(int idSubcategoria);
    List<Product> findBySubmarcaIdMarca(int idMarca);
    List<Product> findBySubcategoriaIdCategoria(int idCategoria);
    List<Product> findBySubcategoriaCategoriaIdFamilia(int idFamilia);
}