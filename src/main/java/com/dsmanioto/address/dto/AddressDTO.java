package com.dsmanioto.address.dto;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressDTO {

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("logradouro")
    private String street;

    @JsonProperty("complemento")
    private String information;

    @JsonProperty("bairro")
    private String neighborhood;

    @JsonProperty("localidade")
    private String city;

    @JsonProperty("uf")
    private String state;

    public AddressDTO() {
    }

    public AddressDTO(String cep, String street, String information, String neighborhood, String city, String state) {
        this.cep = cep;
        this.street = street;
        this.information = information;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
