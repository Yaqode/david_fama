package com.market.fama.web.controller;

import com.market.fama.domain.Product;
import com.market.fama.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getProduct(@PathVariable("productId") int productId) {
        return productService.getProduct(productId);
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productService.delete(productId);
    }

    @GetMapping("/findByIdSubmarca/{id}")
    public List<Product> findByIdSubmarca(@PathVariable("id") int id) {
        return productService.findByIdSubmarca(id);
    }

    @GetMapping("/findByIdSubcategoria/{id}")
    public List<Product> findByIdSubcategoria(@PathVariable("id") int id) {
        return productService.findByIdSubcategoria(id);
    }

    @GetMapping("/findBySubmarcaIdMarca/{id}")
    public List<Product> findBySubmarcaIdMarca(@PathVariable("id") int id) {
        return productService.findBySubmarcaIdMarca(id);
    }

    @GetMapping("/findBySubcategoriaIdCategoria/{id}")
    public List<Product> findBySubcategoriaIdCategoria(@PathVariable("id") int id) {
        return productService.findBySubcategoriaIdCategoria(id);
    }

    @GetMapping("/findBySubcategoriaCategoriaIdFamilia/{id}")
    public List<Product> findBySubcategoriaCategoriaIdFamilia(@PathVariable("id") int id) {
        return productService.findBySubcategoriaCategoriaIdFamilia(id);
    }
}
