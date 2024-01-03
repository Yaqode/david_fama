package com.market.fama.web.controller;

import com.market.fama.domain.Image;
import com.market.fama.domain.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService ImageService;

    @GetMapping("/all")
    public List<Image> getAll() {
        return ImageService.getAll();
    }

    @GetMapping("/{ImageId}")
    public Optional<Image> getImage(@PathVariable("imageId") int imageId) {
        return ImageService.getImage(imageId);
    }

    @PostMapping("/save/product")
    public List<Image> save(@RequestBody List<Image> image) throws IOException {
        return ImageService.save(image);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int imageId) {
        return ImageService.delete(imageId);
    }
}
