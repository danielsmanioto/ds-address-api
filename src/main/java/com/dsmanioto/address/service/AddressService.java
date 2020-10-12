package com.dsmanioto.address.service;

import com.dsmanioto.address.controller.dto.request.AddressDTO;

@FunctionalInterface
public interface AddressService {

    AddressDTO findAddressByCep(String cep);

}
