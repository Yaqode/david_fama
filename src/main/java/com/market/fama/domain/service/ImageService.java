package com.market.fama.domain.service;

import com.market.fama.domain.Image;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ImageService {
    @Autowired
    private ImageRepository ImageRepository;

    private UtilService utilService;

    public List<Image> getAll() {
        List<Image> listImage = ImageRepository.getAll();
        List<Image> listImageImg = new ArrayList<>();;
        listImage.forEach(Image -> {
            try {
                Image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + Image.getImageRoute()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            listImageImg.add(Image);
        });

        return listImageImg;
    }

    public Optional<Image> getImage(int ImageId) {
        Optional<Image> optionalImage = ImageRepository.getImage(ImageId);

        optionalImage.ifPresent(Image -> {
            // Modificar el componente del objeto Image, por ejemplo:
            try {
                Image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + Image.getImageRoute()));
                Image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + Image.getImageRoute()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return optionalImage;
    }

    public Image save(Image image) {
        //Crear carpeta de la imagen
        utilService.crearCarpeta(image.getOrdenNo().toString());
        //Crear la imagen


        return ImageRepository.save(image);
    }

    public boolean delete(int ImageId) {
        return getImage(ImageId).map(Image -> {
            ImageRepository.delete(ImageId);
            return true;
        }).orElse(false);
    }

}
