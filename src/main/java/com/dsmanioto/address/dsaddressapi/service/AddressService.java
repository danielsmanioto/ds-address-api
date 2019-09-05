package com.dsmanioto.address.dsaddressapi.service;

import com.dsmanioto.address.dsaddressapi.dto.AddressDTO;

public interface AddressService {

    AddressDTO findAddressByCep(String cep);

}
