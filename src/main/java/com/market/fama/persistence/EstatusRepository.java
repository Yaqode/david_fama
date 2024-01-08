package com.market.fama.persistence;

import com.market.fama.domain.Status;
import com.market.fama.domain.repository.StatusRepository;
import com.market.fama.persistence.crud.EstatusCrudRepository;
import com.market.fama.persistence.entity.Estatus;
import com.market.fama.persistence.mapper.EstatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstatusRepository implements StatusRepository {

    @Autowired
    private EstatusCrudRepository EstatusCrudRepository;
    @Autowired
    private EstatusMapper mapper;

    @Override
    public List<Status> getAll(){
        List<Estatus> Estatuss = (List<Estatus>) EstatusCrudRepository.findAll();
        return mapper.toStatus(Estatuss);
    }

    @Override
    public Optional<Status> getStatus(int StatusId) {
        return EstatusCrudRepository.findById(StatusId).map(Estatus -> mapper.toStatus(Estatus));
    }

    @Override
    public Status save(Status Status) {
        Estatus Estatus = mapper.toEstatus(Status);
        return mapper.toStatus(EstatusCrudRepository.save(Estatus));
    }

    @Override
    public void delete(int categoryId) {
        EstatusCrudRepository.deleteById(categoryId);
    }
}