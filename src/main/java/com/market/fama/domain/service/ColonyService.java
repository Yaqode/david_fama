package com.market.fama.domain.service;

import com.market.fama.domain.Colony;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.ColonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ColonyService {

    @Autowired
    private ColonyRepository colonyRepository;

    private UtilService utilService;

    public List<Colony> getAll() {
        return colonyRepository.getAll();
    }

    public Optional<Colony> getColony(int ColonyId) {
        return colonyRepository.getColony(ColonyId);
    }

    public Colony save(Colony Colony) {
        return colonyRepository.save(Colony);
    }

    public boolean delete(int ColonyId) {
        return getColony(ColonyId).map(Colony -> {
            colonyRepository.delete(ColonyId);
            return true;
        }).orElse(false);
    }

}
