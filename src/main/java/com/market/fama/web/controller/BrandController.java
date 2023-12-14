package com.market.fama.web.controller;

import com.market.fama.domain.Brand;
import com.market.fama.domain.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/all")
    public List<Brand> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/{brandId}")
    public Optional<Brand> getBrand(@PathVariable("brandId") int brandId) {
        return brandService.getBrand(brandId);
    }

    @PostMapping("/save")
    public Brand save(@RequestBody Brand brand) {
        return brandService.save(brand);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int brandId) {
        return brandService.delete(brandId);
    }
}
