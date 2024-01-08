package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Status;

import java.util.List;
import java.util.Optional;

public interface StatusRepository {
    List<Status> getAll();
    Optional<Status> getStatus(int statusId);
    Status save(Status status);
    void delete(int statusId);
}
