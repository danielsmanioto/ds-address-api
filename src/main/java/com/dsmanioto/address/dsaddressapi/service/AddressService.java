package com.dsmanioto.address.dsaddressapi.service;

import com.dsmanioto.address.dsaddressapi.dto.AddressDTO;

@FunctionalInterface
public interface AddressService {

    AddressDTO findAddressByCep(String cep);

}
