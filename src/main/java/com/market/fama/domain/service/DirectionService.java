package com.market.fama.domain.service;

import com.market.fama.domain.Direction;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DirectionService {
    @Autowired
    private DirectionRepository DirectionRepository;

    private UtilService utilService;

    public List<Direction> getAll() {
        return DirectionRepository.getAll();
    }

    public Optional<Direction> getDirection(int DirectionId) {
        return DirectionRepository.getDirection(DirectionId);

    }

    public List<Direction> getDirectionsByUser(int DirectionId) {
        return DirectionRepository.getDirectionsByUser(DirectionId);

    }

    public Direction save(Direction Direction) {
        return DirectionRepository.save(Direction);
    }

    public boolean delete(int DirectionId) {
        return getDirection(DirectionId).map(Direction -> {
            DirectionRepository.delete(DirectionId);
            return true;
        }).orElse(false);
    }

}
