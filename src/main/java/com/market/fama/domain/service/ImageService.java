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

    public long getCountByProduct(int idProduct) {
        return ImageRepository.getCountByProduct(idProduct);
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

    public List<Image> save(List<Image> images) throws IOException {

        List<Image> imagesSave = new ArrayList<>();

        images.forEach(image -> {
            //Crear carpeta de la imagen
            String nameCarpeta = utilService.crearCarpeta(image.getOrdenNo().toString());

            //Contar imagenes asociados al producto
            long cantidad = getCountByProduct(image.getProductId());

            //Sumamos el numero siguiente
            cantidad++;

            //Definir el nombre con ruta
            String urlImage = "\\" + nameCarpeta + "\\" + nameCarpeta + "_" + cantidad + ".jpg";

            //Crear la imagen
            try {
                utilService.guardarImagenComoBase64(image, "\\img\\productos" , urlImage);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Cambiamos el Base64 por la ruta
            image.setImageRoute(urlImage);

            imagesSave.add(ImageRepository.save(image));
        });
        return imagesSave;
    }

    public boolean delete(int ImageId) {
        return getImage(ImageId).map(Image -> {
            ImageRepository.delete(ImageId);
            return true;
        }).orElse(false);
    }

}
