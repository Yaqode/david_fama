package com.market.fama.domain.repository;

import com.market.fama.domain.Image;

import java.util.List;
import java.util.Optional;

public interface ImageRepository {
    List<Image> getAll();
    long getCountByProduct(int idProduct);
    Optional<Image> getImage(int imageId);
    Image save(Image image);
    void delete(int imageId);
}
