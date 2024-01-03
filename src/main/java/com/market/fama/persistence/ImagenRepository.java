package com.market.fama.persistence;

import com.market.fama.domain.Image;
import com.market.fama.domain.repository.ImageRepository;
import com.market.fama.persistence.crud.ImagenCrudRepository;
import com.market.fama.persistence.entity.Imagen;
import com.market.fama.persistence.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ImagenRepository implements ImageRepository {

    @Autowired
    private ImagenCrudRepository imagenCrudRepository;
    @Autowired
    private ImageMapper mapper;

    @Override
    public List<Image> getAll(){
        List<Imagen> imagenes = (List<Imagen>) imagenCrudRepository.findAll();
        return mapper.toImages(imagenes);
    }

    @Override
    public Optional<Image> getImage(int imageId) {
        return imagenCrudRepository.findById(imageId).map(imagen -> mapper.toImage(imagen));
    }

    @Override
    public Image save(Image image) {
        Imagen imagen = mapper.toImagen(image);
        return mapper.toImage(imagenCrudRepository.save(imagen));
    }

    @Override
    public void delete(int imageId) { imagenCrudRepository.deleteById(imageId); }
}