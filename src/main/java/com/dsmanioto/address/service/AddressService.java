package com.dsmanioto.address.service;

import com.dsmanioto.address.dto.AddressDTO;

@FunctionalInterface
public interface AddressService {

    AddressDTO findAddressByCep(String cep);

}
