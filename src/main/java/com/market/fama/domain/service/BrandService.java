package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Subbrand;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    private UtilService utilService;

    public List<Brand> getAll() {
        List<Brand> listBrand = brandRepository.getAll();
        List<Brand> listBrandImg = new ArrayList<>();;
        listBrand.forEach(brand -> {
            try {
                brand.setLinkImageBrand(utilService.leerImagenComoBase64("\\img\\marcas\\" + brand.getLinkImageBrand()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            listBrandImg.add(brand);
        });

        return listBrandImg;
    }

    public Optional<Brand> getBrand(int brandId) {
        Optional<Brand> optionalBrand = brandRepository.getBrand(brandId);

        optionalBrand.ifPresent(brand -> {
            // Modificar el componente del objeto Brand, por ejemplo:
            try {
                brand.setLinkImageBrand(utilService.leerImagenComoBase64("\\img\\marcas\\" + brand.getLinkImageBrand()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return optionalBrand;
    }


    public Brand save(Brand brand) {
        String urlImage = "\\img\\marcas\\" + brand.getNameBrand() + "_" + "logo" + ".jpg";
        //Crear la imagen
        try {
            utilService.guardarImagenBase64(brand.getLinkImageBrand(),urlImage);
            brand.setLinkImageBrand(urlImage);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return brandRepository.save(brand);
    }

    public boolean delete(int brandId) {
        return getBrand(brandId).map(brand -> {
            brandRepository.delete(brandId);
            return true;
        }).orElse(false);
    }

}
