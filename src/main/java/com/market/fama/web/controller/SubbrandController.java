package com.market.fama.web.controller;

import com.market.fama.domain.Subbrand;
import com.market.fama.domain.service.SubbrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subbrands")
public class SubbrandController {

    @Autowired
    private SubbrandService subbrandService;

    @GetMapping("/all")
    public List<Subbrand> getAll() {
        return subbrandService.getAll();
    }

    @GetMapping("/{subbrandId}")
    public Optional<Subbrand> getSubbrand(@PathVariable("subbrandId") int subbrandId) {
        return subbrandService.getSubbrand(subbrandId);
    }

    @PostMapping("/save")
    public Subbrand save(@RequestBody Subbrand subbrand) {
        return subbrandService.save(subbrand);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int subbrandId) {
        return subbrandService.delete(subbrandId);
    }
}
