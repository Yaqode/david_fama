package com.market.fama.domain.repository;

import com.market.fama.domain.Colony;
import java.util.List;
import java.util.Optional;

public interface ColonyRepository {
    List<Colony> getAll();
    Optional<Colony> getColony(int colonyId);
    Colony save(Colony colony);
    void delete(int colonyId);
}
