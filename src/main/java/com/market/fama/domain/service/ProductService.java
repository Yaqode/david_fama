package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Image;
import com.market.fama.domain.Product;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.BrandRepository;
import com.market.fama.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private UtilService utilService;

    public List<Product> getAll() {
        List<Product> listProducts = productRepository.getAll();
        listProducts.forEach(product -> {
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        return listProducts;
    }

    public Optional<Product> getProduct(int productId) {
        Optional<Product> optionalProduct = productRepository.getProduct(productId);

        optionalProduct.ifPresent(product -> {
            // Modificar el componente del objeto Brand, por ejemplo:
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });

        return optionalProduct;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }

    public List<Product> findByIdSubmarca (int idSubmarca) {
        List<Product> listProducts = productRepository.findByIdSubmarca(idSubmarca);
        listProducts.forEach(product -> {
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        return listProducts;
    }

    public List<Product> findByIdSubcategoria(int idSubcategoria) {
        List<Product> listProducts = productRepository.findByIdSubcategoria(idSubcategoria);
        listProducts.forEach(product -> {
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        return listProducts;
    }

    public List<Product> findBySubmarcaIdMarca(int idMarca) {
        List<Product> listProducts = productRepository.findBySubmarcaIdMarca(idMarca);
        listProducts.forEach(product -> {
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        return listProducts;
    }

    public List<Product> findBySubcategoriaIdCategoria(int idCategoria) {
        List<Product> listProducts = productRepository.findBySubcategoriaIdCategoria(idCategoria);
        listProducts.forEach(product -> {
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        return listProducts;
    }

    public List<Product> findBySubcategoriaCategoriaIdFamilia(int idFamilia) {
        List<Product> listProducts = productRepository.findBySubcategoriaCategoriaIdFamilia(idFamilia);
        listProducts.forEach(product -> {
            product.getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        return listProducts;
    }
}
