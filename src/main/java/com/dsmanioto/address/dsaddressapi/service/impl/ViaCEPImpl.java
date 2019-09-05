package com.dsmanioto.address.dsaddressapi.service.impl;

import com.dsmanioto.address.dsaddressapi.dto.AddressDTO;
import com.dsmanioto.address.dsaddressapi.service.AddressService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCEPImpl implements AddressService {

    @Override
    public AddressDTO findAddressByCep(String cep) {
        return new RestTemplate().getForObject("https://viacep.com.br/ws/" + cep + "/json/unicode/", AddressDTO.class);
    }

}
