package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    private UtilService utilService;

    public List<Brand> getAll() {
        List<Brand> listBrand = brandRepository.getAll();
        List<Brand> listBrandImg = null;
        listBrand.forEach(brand -> {
            try {
                brand.setLinkImageBrand(utilService.leerImagenComoBase64("/marcas/" + brand.getLinkImageBrand()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            listBrandImg.add(brand);
        });

        return brandRepository.getAll();
    }

    public Optional<Brand> getBrand(int brandId) {
        return brandRepository.getBrand(brandId);
    }

    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    public boolean delete(int brandId) {
        return getBrand(brandId).map(brand -> {
            brandRepository.delete(brandId);
            return true;
        }).orElse(false);
    }

}
