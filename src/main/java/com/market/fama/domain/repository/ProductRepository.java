package com.market.fama.domain.repository;

import com.market.fama.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete (int productId);
}
