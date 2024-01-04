package com.market.fama.domain;

import com.market.fama.persistence.entity.Direccion;
import jakarta.persistence.*;

import java.util.List;

public class Colony {
    private int colonyId;
    private String nameColony;
    private List<Direction> directions;

    public int getColonyId() {
        return colonyId;
    }

    public void setColonyId(int colonyId) {
        this.colonyId = colonyId;
    }

    public String getNameColony() {
        return nameColony;
    }

    public void setNameColony(String nameColony) {
        this.nameColony = nameColony;
    }

    public List<Direction> getDirections() {
        return directions;
    }

    public void setDirections(List<Direction> directions) {
        this.directions = directions;
    }
}
