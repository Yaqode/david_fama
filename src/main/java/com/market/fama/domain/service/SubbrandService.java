package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Image;
import com.market.fama.domain.Subbrand;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.BrandRepository;
import com.market.fama.domain.repository.SubbrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubbrandService {
    @Autowired
    private SubbrandRepository subbrandRepository;

    private UtilService utilService;

    public List<Subbrand> getAll() {
        List<Subbrand> listSubbrand = subbrandRepository.getAll();
        List<Subbrand> listSubbrandImg = new ArrayList<>();;
        listSubbrand.forEach(brand -> {
            try {
                brand.setLinkImageSubbrand(utilService.leerImagenComoBase64("\\img\\submarcas\\" + brand.getLinkImageSubbrand()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            listSubbrandImg.add(brand);
        });

        return listSubbrandImg;
    }

    public Optional<Subbrand> getSubbrand(int subbrandId) {
        Optional<Subbrand> optionalSubbrand = subbrandRepository.getSubbrand(subbrandId);

        optionalSubbrand.ifPresent(subbrand -> {
            // Modificar el componente del objeto Brand, por ejemplo:
            try {
                subbrand.setLinkImageSubbrand(utilService.leerImagenComoBase64("\\img\\submarcas\\" + subbrand.getLinkImageSubbrand()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return optionalSubbrand;
    }

    public Subbrand save(Subbrand subbrand) {
        String urlImage = "\\img\\submarcas\\" + subbrand.getNameSubBrand() + "_" + "logo" + ".jpg";
        //Crear la imagen
        try {
            utilService.guardarImagenBase64(subbrand.getLinkImageSubbrand(),urlImage);
            subbrand.setLinkImageSubbrand(urlImage);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return subbrandRepository.save(subbrand);
    }

    public boolean delete(int subbrandId) {
        return getSubbrand(subbrandId).map(subbrand -> {
            subbrandRepository.delete(subbrandId);
            return true;
        }).orElse(false);
    }
}
