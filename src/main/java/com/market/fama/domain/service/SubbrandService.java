package com.market.fama.domain.service;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Subbrand;
import com.market.fama.domain.repository.BrandRepository;
import com.market.fama.domain.repository.SubbrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubbrandService {
    @Autowired
    private SubbrandRepository subbrandRepository;

    public List<Subbrand> getAll() {
        return subbrandRepository.getAll();
    }

    public Optional<Subbrand> getSubbrand(int subbrandId) {
        return subbrandRepository.getSubbrand(subbrandId);
    }

    public Subbrand save(Subbrand subbrand) {
        return subbrandRepository.save(subbrand);
    }

    public boolean delete(int subbrandId) {
        return getSubbrand(subbrandId).map(subbrand -> {
            subbrandRepository.delete(subbrandId);
            return true;
        }).orElse(false);
    }
}
