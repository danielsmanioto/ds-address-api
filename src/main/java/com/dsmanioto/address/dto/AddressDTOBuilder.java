package com.dsmanioto.address.dto;

public class AddressDTOBuilder {
    private String cep;
    private String street;
    private String information;
    private String neighborhood;
    private String city;
    private String state;

    public AddressDTOBuilder setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public AddressDTOBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressDTOBuilder setInformation(String information) {
        this.information = information;
        return this;
    }

    public AddressDTOBuilder setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public AddressDTOBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressDTOBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public AddressDTO createAddressDTO() {
        return new AddressDTO(cep, street, information, neighborhood, city, state);
    }
}