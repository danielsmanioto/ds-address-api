package com.dsmanioto.address.service;

import com.dsmanioto.address.controller.dto.AddressDTO;

@FunctionalInterface
public interface AddressService {

    AddressDTO findAddressByCep(String cep);

}
