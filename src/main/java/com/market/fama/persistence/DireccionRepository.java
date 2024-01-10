package com.market.fama.persistence;

import com.market.fama.domain.Colony;
import com.market.fama.domain.Direction;
import com.market.fama.domain.repository.DirectionRepository;
import com.market.fama.persistence.crud.ColoniaCrudRepository;
import com.market.fama.persistence.crud.DireccionCrudRepository;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.entity.Direccion;
import com.market.fama.persistence.mapper.ColoniaMapper;
import com.market.fama.persistence.mapper.DireccionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DireccionRepository implements DirectionRepository {
    @Autowired
    private DireccionCrudRepository direccionCrudRepository;
    @Autowired
    private DireccionMapper mapper;

    @Override
    public List<Direction> getAll() {
        List<Direccion> direcciones = (List<Direccion>) direccionCrudRepository.findAll();
        return mapper.toDirections(direcciones);
    }

    @Override
    public Optional<Direction> getDirection(int directionId) {
        return direccionCrudRepository.findById(directionId).map(direccion -> mapper.toDirection(direccion));
    }

    @Override
    public List<Direction> getDirectionsByUser(int userId) {
        List<Direccion> direcciones = (List<Direccion>) direccionCrudRepository.findByIdUsuario(userId);
        return mapper.toDirections(direcciones);
    }

    @Override
    public Direction save(Direction direction) {
        Direccion direccion = mapper.toDireccion(direction);
        return mapper.toDirection(direccionCrudRepository.save(direccion));
    }

    @Override
    public void delete(int directionId) {
        direccionCrudRepository.deleteById(directionId);
    }

}
