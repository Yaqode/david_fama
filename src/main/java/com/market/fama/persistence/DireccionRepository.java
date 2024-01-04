package com.market.fama.persistence;

import com.market.fama.domain.Direction;
import com.market.fama.domain.repository.DirectionRepository;

import java.util.List;
import java.util.Optional;

public class DireccionRepository implements DirectionRepository {
    @Override
    public List<Direction> getAll() {
        return null;
    }

    @Override
    public Optional<Direction> getDirection(int directionId) {
        return Optional.empty();
    }

    @Override
    public Direction save(Direction direction) {
        return null;
    }

    @Override
    public void delete(int directionId) {

    }
}
