package com.market.fama.domain;

public class Useraddress {
    private int direccionusuarioId;
    private Address address;
    private Person person;


    public int getDireccionusuarioId() {
        return direccionusuarioId;
    }

    public void setDireccionusuarioId(int direccionusuarioId) {
        this.direccionusuarioId = direccionusuarioId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
