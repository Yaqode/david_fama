package com.market.fama.web.controller;

import com.market.fama.domain.Status;
import com.market.fama.domain.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estatus")
public class StatusController {

    @Autowired
    private StatusService StatusService;

    @GetMapping("/all")
    public List<Status> getAll() {
        return StatusService.getAll();
    }

    @GetMapping("/{StatusId}")
    public Optional<Status> getStatus(@PathVariable("StatusId") int StatusId) {
        return StatusService.getStatus(StatusId);
    }

    @PostMapping("/save")
    public Status save(@RequestBody Status Status) {
        return StatusService.save(Status);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int StatusId) {
        return StatusService.delete(StatusId);
    }
}