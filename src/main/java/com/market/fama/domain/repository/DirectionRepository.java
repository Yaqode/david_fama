package com.market.fama.domain.repository;

import com.market.fama.domain.Direction;
import java.util.List;
import java.util.Optional;

public interface DirectionRepository {
    List<Direction> getAll();
    Optional<Direction> getDirection(int directionId);
    Direction save(Direction direction);
    void delete(int directionId);
}
