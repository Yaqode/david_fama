package com.market.fama.web.controller;

import com.market.fama.domain.Subcategory;
import com.market.fama.domain.service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subcategories")
public class SubcategoryController {

    @Autowired
    private SubcategoryService subcategoryService;

    @GetMapping("/all")
    public List<Subcategory> getAll() {
        return subcategoryService.getAll();
    }

    @GetMapping("/{subcategoryId}")
    public Optional<Subcategory> getSubcategory(@PathVariable("subcategoryId") int subcategoryId) {
        return subcategoryService.getSubcategory(subcategoryId);
    }

    @PostMapping("/save")
    public Subcategory save(@RequestBody Subcategory subcategory) {
        return subcategoryService.save(subcategory);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int subcategoryId) {
        return subcategoryService.delete(subcategoryId);
    }
}
