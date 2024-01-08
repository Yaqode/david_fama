package com.market.fama.persistence;

import com.market.fama.domain.Buy;
import com.market.fama.domain.repository.BuyRepository;
import com.market.fama.persistence.crud.CompraCrudRepository;
import com.market.fama.persistence.entity.Compra;
import com.market.fama.persistence.mapper.CompraMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements BuyRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private CompraMapper mapper;

    @Override
    public List<Buy> getAll(){
        List<Compra> Compras = (List<Compra>) compraCrudRepository.findAll();
        return mapper.toBuy(Compras);
    }

    @Override
    public List<Buy> getConfirmadas(){
        List<Compra> Compras = (List<Compra>) compraCrudRepository.findAll();
        return mapper.toBuy(Compras);
    }

    @Override
    public Optional<Buy> getBuy(int BuyId) {
        return compraCrudRepository.findById(BuyId).map(Compra -> mapper.toBuy(Compra));
    }

    @Override
    public Buy save(Buy Buy) {
        Compra Compra = mapper.toCompra(Buy);
        return mapper.toBuy(compraCrudRepository.save(Compra));
    }

    @Override
    public void delete(int categoryId) {
        compraCrudRepository.deleteById(categoryId);
    }
}