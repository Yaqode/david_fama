package com.market.fama.web.controller;

import com.market.fama.domain.Direction;
import com.market.fama.domain.Family;
import com.market.fama.domain.service.DirectionService;
import com.market.fama.domain.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/directions")
public class DirectionController {

    @Autowired
    private DirectionService directionService;

    @GetMapping("/all")
    public List<Direction> getAll() {
        return directionService.getAll();
    }

    @GetMapping("/{directionId}")
    public Optional<Direction> getDirection(@PathVariable("directionId") int directionId) {
        return directionService.getDirection(directionId);
    }

    @GetMapping("/direccion/user/{userId}")
    public List<Direction> getDirectionsByUser(@PathVariable("userId") int userId) {
        return directionService.getDirectionsByUser(userId);
    }

    @PostMapping("/save")
    public Direction save(@RequestBody Direction direction) {
        return directionService.save(direction);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int directionId) {
        return directionService.delete(directionId);
    }
}