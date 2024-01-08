package com.market.fama.persistence;

import com.market.fama.domain.StatusOrder;
import com.market.fama.domain.repository.StatusOrderRepository;
import com.market.fama.persistence.crud.EstatusPedidoCrudRepository;
import com.market.fama.persistence.entity.EstatusPedido;
import com.market.fama.persistence.mapper.EstatusPedidoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstatusPedidoRepository implements StatusOrderRepository {

    @Autowired
    private EstatusPedidoCrudRepository EstatusPedidoCrudRepository;
    @Autowired
    private EstatusPedidoMapper mapper;

    @Override
    public List<StatusOrder> getAll(){
        List<EstatusPedido> EstatusPedidos = (List<EstatusPedido>) EstatusPedidoCrudRepository.findAll();
        return mapper.toStatusOrder(EstatusPedidos);
    }

    @Override
    public Optional<StatusOrder> getStatusOrder(int StatusOrderId) {
        return EstatusPedidoCrudRepository.findById(StatusOrderId).map(EstatusPedido -> mapper.toStatusOrder(EstatusPedido));
    }

    @Override
    public StatusOrder save(StatusOrder StatusOrder) {
        EstatusPedido EstatusPedido = mapper.toEstatusPedido(StatusOrder);
        return mapper.toStatusOrder(EstatusPedidoCrudRepository.save(EstatusPedido));
    }

    @Override
    public void delete(int categoryId) {
        EstatusPedidoCrudRepository.deleteById(categoryId);
    }
}