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

    @Override
    public List<Product> getAll(){
        List<Producto> subcategorias = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(subcategorias);
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId) { productoCrudRepository.deleteById(productId); }

    @Override
    public List<Product> findByIdSubmarca(int idSubmarca){
        List<Producto> bySubmarca = (List<Producto>) productoCrudRepository.findByIdSubmarca(idSubmarca);
        return mapper.toProducts(bySubmarca);
    }

    @Override
    public List<Product> findByIdSubcategoria(int idSubcategoria){
        List<Producto> bySubcategoria = (List<Producto>) productoCrudRepository.findByIdSubcategoria(idSubcategoria);
        return mapper.toProducts(bySubcategoria);
    }

    @Override
    public  List<Product> findBySubmarcaIdMarca(int idMarca){
        List<Producto> byMarca = (List<Producto>) productoCrudRepository.findBySubmarcaIdMarca(idMarca);
        return mapper.toProducts(byMarca);
    }

    @Override
    public List<Product> findBySubcategoriaIdCategoria(int idCategoria){
        List<Producto> byCategorias = (List<Producto>) productoCrudRepository.findBySubcategoriaIdCategoria(idCategoria);
        return mapper.toProducts(byCategorias);
    }

    @Override
    public List<Product> findBySubcategoriaCategoriaIdFamilia(int idFamilia){
        List<Producto> byFamilias = (List<Producto>) productoCrudRepository.findBySubcategoriaCategoriaIdFamilia(idFamilia);
        return mapper.toProducts(byFamilias);
    }
}