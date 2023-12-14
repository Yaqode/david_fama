package com.market.fama.web.controller;

import com.market.fama.domain.Category;
import com.market.fama.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{categoryId}")
    public Optional<Category> getCategory(@PathVariable("categoryId") int categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int categoryId) {
        return categoryService.delete(categoryId);
    }
}