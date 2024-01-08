package com.market.fama.domain.service;

import com.market.fama.domain.Status;
import com.market.fama.domain.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {
    @Autowired
    private StatusRepository StatusRepository;

    public List<Status> getAll() {
        return StatusRepository.getAll();
    }

    public Optional<Status> getStatus(int StatusId) {
        return StatusRepository.getStatus(StatusId);
    }

    public Status save(Status Status) {
        return StatusRepository.save(Status);
    }

    public boolean delete(int StatusId) {
        return getStatus(StatusId).map(Status -> {
            StatusRepository.delete(StatusId);
            return true;
        }).orElse(false);
    }
}
