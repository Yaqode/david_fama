package com.market.fama.domain;

public class Direction {
    private int directionId;
    private String directionStreet;
    private int noIntDirection;
    private int noExtDirection;
    private int directionCP;
    private String directionReference;
    private int colonyId;
    private int userId;
    private Colony colonies;
    private User users;

    public int getDirectionId() {
        return directionId;
    }

    public void setDirectionId(int directionId) {
        this.directionId = directionId;
    }

    public String getDirectionStreet() {
        return directionStreet;
    }

    public void setDirectionStreet(String directionStreet) {
        this.directionStreet = directionStreet;
    }

    public int getNoIntDirection() {
        return noIntDirection;
    }

    public void setNoIntDirection(int noIntDirection) {
        this.noIntDirection = noIntDirection;
    }

    public int getNoExtDirection() {
        return noExtDirection;
    }

    public void setNoExtDirection(int noExtDirection) {
        this.noExtDirection = noExtDirection;
    }

    public int getDirectionCP() {
        return directionCP;
    }

    public void setDirectionCP(int directionCP) {
        this.directionCP = directionCP;
    }

    public String getDirectionReference() {
        return directionReference;
    }

    public void setDirectionReference(String directionReference) {
        this.directionReference = directionReference;
    }

    public int getColonyId() {
        return colonyId;
    }

    public void setColonyId(int colonyId) {
        this.colonyId = colonyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Colony getColonies() {
        return colonies;
    }

    public void setColonies(Colony colonies) {
        this.colonies = colonies;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}