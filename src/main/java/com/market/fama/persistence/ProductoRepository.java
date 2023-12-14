package com.market.fama.persistence;

import com.market.fama.domain.Product;
import com.market.fama.domain.repository.ProductRepository;
import com.market.fama.persistence.crud.ProductoCrudRepository;
import com.market.fama.persistence.entity.Producto;
import com.market.fama.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;

    public List<Product> getAll(){
        List<Producto> subcategorias = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(subcategorias);
    }

    public Optional<Product> getProduct(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    public void delete(int productId) { productoCrudRepository.deleteById(productId); }
}