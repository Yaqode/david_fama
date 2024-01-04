package com.market.fama.web.controller;

import com.market.fama.domain.Colony;
import com.market.fama.domain.Family;
import com.market.fama.domain.service.ColonyService;
import com.market.fama.domain.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/colonies")
public class ColonyController {

    @Autowired
    private ColonyService colonyService;

    @GetMapping("/all")
    public List<Colony> getAll() {
        return colonyService.getAll();
    }

    @GetMapping("/{colonyId}")
    public Optional<Colony> getColony(@PathVariable("colonyServiceId") int colonyId) {
        return colonyService.getColony(colonyId);
    }

    @PostMapping("/save")
    public Colony save(@RequestBody Colony colony) {
        return colonyService.save(colony);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int colonyId) {
        return colonyService.delete(colonyId);
    }
}