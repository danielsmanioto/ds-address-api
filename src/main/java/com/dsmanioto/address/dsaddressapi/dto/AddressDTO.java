package com.dsmanioto.address.dsaddressapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressDTO {

    @JsonProperty("cep")
    private String CEP;

    @JsonProperty("logradouro")
    private String street;

    private String number;

    @JsonProperty("complemento")
    private String information;

    @JsonProperty("bairro")
    private String neighborhood;

    @JsonProperty("localidade")
    private String city;

    @JsonProperty("uf")
    private String state;

    public String getCEP() {
        return CEP;
    }

    public AddressDTO setCEP(String CEP) {
        this.CEP = CEP;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public AddressDTO setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public AddressDTO setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getInformation() {
        return information;
    }

    public AddressDTO setInformation(String information) {
        this.information = information;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public AddressDTO setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressDTO setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public AddressDTO setState(String state) {
        this.state = state;
        return this;
    }
}
