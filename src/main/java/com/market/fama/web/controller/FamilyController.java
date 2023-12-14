package com.market.fama.web.controller;

import com.market.fama.domain.Family;
import com.market.fama.domain.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/families")
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @GetMapping("/all")
    public List<Family> getAll() {
        return familyService.getAll();
    }

    @GetMapping("/{familyId}")
    public Optional<Family> getFamily(@PathVariable("familyId") int familyId) {
        return familyService.getFamily(familyId);
    }

    @PostMapping("/save")
    public Family save(@RequestBody Family family) {
        return familyService.save(family);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int familyId) {
        return familyService.delete(familyId);
    }
}
